package fifteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	
	LinkedList<Ingredient> sastojci = new LinkedList<Ingredient>();
	public static void main(String[] args) {
		
		try(Scanner in = new Scanner(new File("D:\\input15.txt"))){
			Test test = new Test();
			while(in.hasNextLine()){
				String[] hello = in.nextLine().split(" ");
				test.sastojci.add(new Ingredient(Integer.parseInt(hello[2]), 
						Integer.parseInt(hello[5]), Integer.parseInt(hello[8]),
						Integer.parseInt(hello[11]),Integer.parseInt(hello[14])));
				
			}
			int max = 0;
			for(int i=0; i<100; i++){
				for (int j = 0; j < 100; j++) {
					for (int j2 = 0; j2 < 100; j2++) {
						for (int k = 0; k < 100; k++) {
							int score = 0;
							int capacity = 0;
							int durability = 0;
							int flavor = 0;
							int texture = 0;
							
							if((i+j+j2+k) == 100){
								capacity = i*(test.sastojci.get(0).getCapacity()) + j*(test.sastojci.get(1).getCapacity())
										+ j2*(test.sastojci.get(2).getCapacity()) + k*(test.sastojci.get(3).getCapacity());
								durability = i*(test.sastojci.get(0).getDurability()) + j*(test.sastojci.get(1).getDurability())
										+ j2*(test.sastojci.get(2).getDurability()) + k*(test.sastojci.get(3).getDurability());
								flavor = i*(test.sastojci.get(0).getFlavor()) + j*(test.sastojci.get(1).getFlavor())
										+ j2*(test.sastojci.get(2).getFlavor()) + k*(test.sastojci.get(3).getFlavor());
								texture = i*(test.sastojci.get(0).getTexture()) + j*(test.sastojci.get(1).getTexture())
										+ j2*(test.sastojci.get(2).getTexture()) + k*(test.sastojci.get(3).getTexture());
								if(capacity<=0 || durability<=0 || flavor <=0 || texture<=0){
									score = 0;
									continue;
								}
								if(i*(test.sastojci.get(0).getCalories()) + j*(test.sastojci.get(1).getCalories())
										+ j2*(test.sastojci.get(2).getCalories()) + k*(test.sastojci.get(3).getCalories()) == 500){
									score = capacity * durability * flavor * texture;
									if(score > max) max = score;
								}
							}
						}
					}
				}
			}
			System.out.println(max);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

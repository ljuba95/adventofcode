package sixteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	LinkedList<Sue> aunts = new LinkedList<Sue>();
	public static void main(String[] args) {
		
		try(Scanner in = new Scanner(new File("D:\\input16.txt"))){
			Test test = new Test();
			String[] hello = {"children:", "cats:","samoyeds:","pomeranians:","akitas:"
				,"vizslas:","goldfish:","trees:","cars:","perfumes:"};
			while(in.hasNextLine()){
				String[] line = in.nextLine().split(" ");
				Sue sue = new Sue(Integer.parseInt(line[1].replaceAll("\\D+", "")));
				int [] niz = sue.getYo();
				for (int i = 0; i < hello.length; i++) {
					if(line[2].equals(hello[i])){
						niz[i]=Integer.parseInt(line[3].replaceAll("\\D+", ""));	
					}
					if(line[4].equals(hello[i])){
						niz[i]=Integer.parseInt(line[5].replaceAll("\\D+", ""));
					}
					if(line[6].equals(hello[i])){
						niz[i]=Integer.parseInt(line[7]);
					}
					sue.setYo(niz);
				}

				test.aunts.add(sue);
			}
			
			int match = 0;
			int [] niz = {3,7,2,3,0,0,5,3,2,1};
			for (Sue sue : test.aunts) {
				match = 0;
				for (int i = 0; i < niz.length; i++) {
					if(i == 1 || i == 7){
						if(sue.getYo()[i]>niz[i] && sue.getYo()[i]>=0) match++;
					}
					if(i == 3 || i == 6){
						if(sue.getYo()[i]<niz[i] && sue.getYo()[i]>=0) match++;
					}
					if(sue.getYo()[i] == niz[i]) match++;
					
				}
				if(match == 3) System.out.println(sue.getId());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

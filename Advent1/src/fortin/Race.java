package fortin;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.LinkedList;
import java.util.Scanner;

public class Race {
	LinkedList<Deer> deerz = new LinkedList<Deer>();
	
	
	public void check(){
		for (Deer deer : deerz) {
			deer.check();
		}
		int max = 0;
		for (Deer deer : deerz) {
			if(deer.getDistance()>max){
				max = deer.getDistance();
			}
		}

		for (Deer deer : deerz) {
			if(deer.getDistance() == max){
				deer.setPoints(deer.getPoints()+1);
			}
		}
	}
	public static void main(String[] args) {
		Race race = new Race();
		try(Scanner sc = new Scanner(new File("D:\\input14.txt"))){
			while(sc.hasNextLine()){
				String[] line = sc.nextLine().split(" ");
				race.deerz.add(new Deer(line[0], Integer.parseInt(line[3]), Integer.parseInt(line[6]), Integer.parseInt(line[13])));
			}
			for(int i = 0; i<2503;i++){
				race.check();
				
			}
			int max = 0;
			for (Deer deer : race.deerz) {
				if(deer.getPoints() > max)
					max = deer.getPoints();
			}
			System.out.println(max	);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

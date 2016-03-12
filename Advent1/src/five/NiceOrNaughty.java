package five;

import java.util.LinkedList;
import java.util.Scanner;

public class NiceOrNaughty {
	public static void main(String[] args) {
		int nice = 0;
		Scanner in = new Scanner(System.in);
		LinkedList<String> yo = new LinkedList<>();
		String s;
		int samogl = 0,dupli = 0;
		while( !(s = in.nextLine()).equals(" ")){
			yo.add(s.trim());
		}
		for (int i = 0; i < yo.size(); i++) {
			for (int j = 0; j < yo.get(i).length(); j++) {
				if(yo.get(i).charAt(j)== 'a' || yo.get(i).charAt(j)== 'e' || yo.get(i).charAt(j)== 'i' ||
						yo.get(i).charAt(j)== 'o' || yo.get(i).charAt(j)== 'u') samogl++;
				if(j != yo.get(i).length()-1){
					if(yo.get(i).charAt(j) == yo.get(i).charAt(j+1)) dupli++;
				}
			}
			if(!(yo.get(i).contains("ab")|| yo.get(i).contains("cd")|| yo.get(i).contains("pq")|| yo.get(i).contains("xy")) && dupli>=1 && samogl >=3)
				nice++;
			samogl=0;
			dupli =0;
		}
		in.close();
		System.out.println(nice);

	}
	
}

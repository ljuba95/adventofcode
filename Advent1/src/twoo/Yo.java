package twoo;
import java.util.LinkedList;
import java.util.Scanner;

public class Yo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> dimensions = new LinkedList<>();
		int l=0,w=0,h=0;
		int total=0;
		int max = 0;
		String s;
		while( !(s = in.nextLine()).equals(" ")){
			dimensions.add(s);
		}
		for (int i = 0; i < dimensions.size(); i++) {
			l = Integer.parseInt(dimensions.get(i).trim().split("x")[0]);
			w = Integer.parseInt(dimensions.get(i).trim().split("x")[1]);
			h = Integer.parseInt(dimensions.get(i).trim().split("x")[2]);
			total += (2*l*w + 2*w*h + 2*h*l);
			max = l;
			if(w>max) max = w;
			if(h>max) max = h;
			if(max==l) total += w*h;
			else if(max == w) total += l*h;
			else total += w*l;
		}
		
		System.out.println(total);
	}
}

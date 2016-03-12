package three;

import java.util.LinkedList;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] mat = new int[2000][2000];
		int total = 0;
		int i = 0,j=0;

		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat.length; j++) {
				mat[i][j] =0;
			}
		}
		i=1000;
		j=1000;
		mat[i][j]=1;
		String s = in.nextLine();
		for (int k = 0; k < s.length(); k++) {
			if(s.charAt(k) == '>') j++;
			else if(s.charAt(k)== '<') j--;
			else if(s.charAt(k)== '^') i--;
			else if(s.charAt(k)=='v')i++;
			if(mat[i][j]==0) mat[i][j]=1;
		}
		for (int k = 0; k < mat.length; k++) {
			for (int k2 = 0; k2 < mat.length; k2++) {
				if(mat[k][k2]==1) total++;
			}
		}
		System.out.println(total);
		
		
		
	}
	

}

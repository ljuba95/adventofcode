package ten;

import java.util.Scanner;

public class LookAndSay {
	public static void main(String[] args) {
		String yo = "1113122113";
		String lel = "";
		int shit =1;
		char dick=' ';
		for (int i = 0; i < 40; i++) {
			dick = yo.charAt(0);
			shit=1;
			lel="";
			for (int j = 1; j <= yo.length(); j++) {
				if(j==yo.length()){
					lel=lel.concat(String.valueOf(shit)).concat(String.valueOf(dick));
					break;
				}
					
				if(yo.charAt(j)==dick)shit++;
				else {
					lel = lel.concat(String.valueOf(shit)).concat(String.valueOf(dick));
					shit=1;
					dick = yo.charAt(j);
				}
			}
			yo=lel;
		}
		System.out.println(yo.length());
	}
}

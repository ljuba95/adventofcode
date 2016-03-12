package eight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class StringzEscape {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("D:\\input8.txt"));
        String line;
        int chars=0;
        int mem=0;
        while ((line = reader.readLine()) != null) {
            chars+=line.length();
            for (int i = 1; i < line.length()-1; i++) {
				if(line.charAt(i) == '\\'){
					if(line.charAt(i+1)=='x'){
						i+=3;
					}else i++;
				}
				mem++;
			}
            
        }
        System.out.println(chars-mem);
	}
}

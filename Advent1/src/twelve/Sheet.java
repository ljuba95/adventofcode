package twelve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sheet {
	public static void main(String[] args) throws Exception {
	    int sum = 0;
	    try (BufferedReader scan = new BufferedReader(new FileReader(new File("D:\\json.txt")))) {
	        while (scan.ready()) {
	            boolean jeBroj = true;
	            StringBuilder sb = new StringBuilder();
	            while (jeBroj) {
	                char c = (char) scan.read();
	                jeBroj = Character.isDigit(c) || (c == '-' && sb.length()==0);
	                if (jeBroj) sb.append(c);
	            }
	            if (sb.length() > 0) sum += Integer.parseInt(sb.toString());
	        }
	    }
	    System.out.println(sum);
	}
}

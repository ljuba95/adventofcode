package nain;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Collections2;

public class Path {
	public static void main(String[] args) throws Exception{
		Map<String, Integer> distances = new HashMap<>();
		Set<String> places = new HashSet<>();
		BufferedReader reader = new BufferedReader(new FileReader("D:\\input9.txt"));
        String line;
        int min = Integer.MAX_VALUE;
        while ((line = reader.readLine()) != null) {
            String[] str = line.split(" ");
            places.add(str[0]);
            places.add(str[2]);
            distances.put(str[0]+str[2], Integer.parseInt(str[4]));
            distances.put(str[2]+str[0], Integer.parseInt(str[4]));
            
        }
        for(List<String> perm : Collections2.permutations(places)) {
            int len = 0;
            for (int i = 0; i < perm.size() -1; i++) {
                len += distances.get(perm.get(i)+perm.get(i+1));
            }
            if (len < min) {
                min = len;
                
            }
        }
        System.out.println(min);
	}
}

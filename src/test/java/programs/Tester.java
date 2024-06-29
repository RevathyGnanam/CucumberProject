package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Tester {

	public static void main(String[] args) {
		String str = "grass is greener on the other side"; 
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		char maxchar = '\0';
		int maxcount = 0;
		
		char minchar = '\0';
		int mincount = 0;
		
		Set<Entry<Character, Integer>> entry = map.entrySet();
		for (Entry<Character, Integer> entry2 : entry) {
			if(entry2.getValue()>maxcount) {
				maxchar = entry2.getKey();
				maxcount= entry2.getValue();
				
			}else if(entry2.getValue()<mincount&&entry2.getValue()!=0) {
				minchar = entry2.getKey();
				mincount= entry2.getValue();
			}
			
		}
		
		System.out.println(maxchar+":"+maxcount);
		System.out.println(minchar+":"+mincount);

	}

}

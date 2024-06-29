package PDFPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String s = "qwertye";
		char[] ch=s.toCharArray();
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		for (char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		System.out.println(map);

		Set<Entry<Character, Integer>> entries = map.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey());
			
		}
	}

}

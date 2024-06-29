package PDFPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String s = "dad is my dad";
		String[] words = s.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String c : words) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);
			}
			
		}
System.out.println(map);
Set<Entry<String, Integer>> entries = map.entrySet();
for (Entry<String, Integer> entry : entries) {
	System.out.println(entry.getKey());
}
	}

}

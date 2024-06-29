package greentechprograms.StringPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfACharacter {

	public static void main(String[] args) {
		String s= "Samyuktha";

		char[] newstring = s.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : newstring) {

			if(map.containsKey(c)) {

				map.put(c, map.get(c)+1);

			}else {
				map.put(c, 1);
			}

		}

		char maxchar ='\0'; //declaring for key
		int maxcount =0; //declaring for  value
		Set<Entry<Character, Integer>> c = map.entrySet();
		for (Entry<Character, Integer> entry : c) {
			if(entry.getValue()>maxcount) {
				maxchar = entry.getKey();
				maxcount = entry.getValue();
				
			}
			
		}
		
		System.out.println(maxchar  +" "  +maxcount);
	}

}

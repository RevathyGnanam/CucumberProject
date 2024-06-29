package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicateChar {

	public static void main(String[] args) {
		
		String givenString = "Revatthyismother";
		//map create paniko apo than we can add each string
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//string to char uh convert 
				char[] repeatedString = givenString.toCharArray();
			//add each char in map a
				for (char c : repeatedString) {
					
					//repeated uh iruntha get method pani+1 podanum ilana just ,1 podanum
					if(map.containsKey(c)) {
						map.put(c, map.get(c)+1);
					}
					else {
						map.put(c, 1);
					}
										
					
				}
				//hashmap to map change panu,char count greater than 1 means print the char
				Set<Entry<Character, Integer>> entry = map.entrySet();
				for ( Entry<Character, Integer> entries : entry) {
					if(entries.getValue()>1) {
						System.out.println(entries.getKey()
                                + " : "
                                + entries.getValue());
					}
					
				}
	}

}

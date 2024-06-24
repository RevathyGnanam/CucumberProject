package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Tester {

	public static void main(String[] args) {
		String s = "REVATHYgovindasamy";
		String word="";
		String word1="";
		for (int i = 0; i < s.length(); i++) {
			
			if(Character.isLowerCase(s.charAt(i))) {
				word =word+s.charAt(i);
			}
			
		}
		
		System.out.println(word);
		for (int j = 0; j < word.length(); j++) {
			
			if((word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u')){
				word1 = word1+word.charAt(j);
			}
			
			
		}
		System.out.println("Print the vowels:"+word1);
		
	}

}

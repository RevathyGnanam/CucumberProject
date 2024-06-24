package PDFPrograms;

import java.util.Iterator;

public class WordFirstLetterCapitalString {

	public static void main(String[] args) {
		String s= "samyuktha dada is my husband";
	char[]	words = s.toCharArray();
	for (int i = 0; i < words.length; i++) {
		words[0]= Character.toUpperCase(words[0]);
		if(words[i]==' ') {
			words[i+1] = Character.toUpperCase(words[i+1]);
		}
	}
	String newstring = String.valueOf(words);
	System.out.println(newstring);
	
	}

}

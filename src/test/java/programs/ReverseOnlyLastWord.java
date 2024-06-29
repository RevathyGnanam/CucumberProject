package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReverseOnlyLastWord {

	public static void main(String[] args) {
		String str ="Great responsibility Great";
		String[] newwords = str.split(" ");
		//String apeendword=newwords[0]+" "+newwords[1];
		String nstr="";
		String word = newwords[1];
		for (int j = word.length()-1; j >=0; j--) {
			nstr=nstr+word.charAt(j);
		}
		System.out.println(newwords[0]+" "+nstr+" "+newwords[2]);
	}

}

package javaprograms;

import java.util.Arrays;

public class ArraysToString {

	
	public static void main(String[] args) {
		String[] names = {"Rev","Samyu","Gnan","Vicky"};
		int namelength = names.length;
		System.out.println(namelength);
		System.out.println(Arrays.toString(names));
		
		int[] i = new int[5];
	
		i[0] =100;
		i[1] =200;
		i[2] =300;
		i[3] =400;
		i[4] =500;
		System.out.println(Arrays.toString(i));
		
	}	
			
		
		
		
}

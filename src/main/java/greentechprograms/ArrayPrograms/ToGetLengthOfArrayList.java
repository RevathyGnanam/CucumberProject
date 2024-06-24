package greentechprograms.ArrayPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ToGetLengthOfArrayList {

	public static void main(String[] args) {
		int[] a = {10,10,20,50,50,60,60,80,20};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer c : a) {
			list.add(c);
			}
		
		System.out.println("Output: " + list.size());


	}

}

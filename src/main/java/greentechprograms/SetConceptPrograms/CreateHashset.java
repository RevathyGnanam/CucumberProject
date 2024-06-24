package greentechprograms.SetConceptPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CreateHashset {

	public static void main(String[] args) {
		Integer[] a= {10,20,30,40,50,60,70,80,90,10,20};
		
		Set<Integer> set= new  TreeSet<Integer>((Arrays.asList(a)));
	//	set.addAll(a);
		for (Integer sets : set) {
			System.out.println(sets);
			
		}

	}

}

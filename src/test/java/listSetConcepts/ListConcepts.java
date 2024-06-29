package listSetConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListConcepts {

	public static void main(String[] args) {
		List<String> myfruits = new ArrayList<String>();
		//adding the values
		myfruits.add("Orange");
		myfruits.add("pineapple");
		myfruits.add("tutifrooti");
		//sorting concept
		Collections.sort(myfruits);
		for (String myfruit : myfruits) {
			System.out.println(myfruit);
			
		}
		boolean test = myfruits.contains("pineapple");
		System.out.println(test);
		
		boolean test1 = myfruits.isEmpty();
		System.out.println(test1);
		
		for (String myfruit1 : myfruits) {
			System.out.println(myfruit1);
			
		}
		
		
	}

}

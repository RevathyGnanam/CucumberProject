package listSetConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {

	public static void main(String[] args) {
		//HashSet - It will not maintain insertion order
		Set<String> myFruits = new HashSet<String>();
		myFruits.add("Revathy");
		myFruits.add("Sam");
		myFruits.add("Gnanam");
		myFruits.add("Sam");
		myFruits.add("Sam");
	//if you create list following set means it will follow set concept only	
		List<String> newList = new ArrayList<String>(myFruits);
		for (String myFruit : newList) {
			System.out.println(myFruit);
			boolean test = myFruit.isEmpty();
			System.out.println(test);
			boolean test1 = myFruit.contains("vicky");
			System.out.println(test1);
		}
		//set- it will maintain ascending order
		Set<Integer> fruits = new TreeSet<Integer>();
		fruits.add(10);
		fruits.add(340);
		fruits.add(98);
		for (Integer fruit : fruits) {
			System.out.println(fruit);
		}
//LinkedHashSet -Insertion order 
		Set<String> veggies = new LinkedHashSet<String>();
		veggies.add("Beetroot");
		veggies.add("banana");
		for (String veggie : veggies) {
			System.out.println(veggie);
			
		}
	}

}

package greentechprograms.ArrayPrograms;

import java.util.LinkedList;
import java.util.List;

public class LinkedListLength {

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5,6,7,8,9,10,11};
		List<Integer> list = new LinkedList<Integer>();
		for (Integer linkedlist : a) {
			list.add(linkedlist);
		}
		System.out.println(list.size());

	}

}

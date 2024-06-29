package greentechprograms.ArrayPrograms;

import java.util.LinkedList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

		Integer[] a= {10,20,30,90,10};

		//List<Integer> list = new LinkedList<Integer>();
		int index =0;
		for (Integer c : a) {
			if(c==10) {
				System.out.println(index);		
			}
			index++;
		}

	}

}

package greentechprograms.ArrayPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class FirstMaxValueAndSecondMaxValue {

	public static void main(String[] args) {
		int[] a = {10,10, 20, 30, 90, 40, 50};
	//	ArrayList<Integer> list = new ArrayList<Integer>();
		int temp=0;
		for(int i=0;i<a.length;i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				}
			}
			System.out.println("Ascending order: " + a[i]); 
		}
		
		System.out.println("Minimum Value: " + a[0]);
		System.out.println("second minimum Value: " + a[1]);
		 System.out.println("Last maximum Value: " + a[a.length-1]);
		 System.out.println("second maximum Value: " + a[a.length-2]);
       
	//	

	}

}

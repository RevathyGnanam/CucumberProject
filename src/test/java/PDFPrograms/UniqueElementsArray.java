package PDFPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class UniqueElementsArray {

	public static void main(String[] args) {
		//output: 10,20,30,40,50
		int[] a= {10,20,10,20,30,30,40,50};
		Arrays.sort(a);
		int len = a.length;
		int k=0;
		for (int i = 0; i <len-1; i++) {
			
				if(a[i]!=a[i+1]) {
					a[k++]= a[i];
				}
			
			
		}
		
		a[k++]=a[len-1];
		len=k;
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
			
		}
		
		
		

	}

}

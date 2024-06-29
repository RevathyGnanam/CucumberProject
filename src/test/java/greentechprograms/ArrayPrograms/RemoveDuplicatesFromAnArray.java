package greentechprograms.ArrayPrograms;

import java.util.Arrays;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		int[] a = {10,10,20,50,50,60,60,80,20};
		Arrays.sort(a);
		int len = a.length;
		int k=0;
		for (int i = 0; i <len-1; i++) {
			if(a[i]!=a[i+1]) {
				a[k++]=	a[i];
			}

		}
		a[k++]= a[len-1];
		len =k;
for (int i = 0; i < len; i++) {
	System.out.println(a[i]);
	
}

	}

}

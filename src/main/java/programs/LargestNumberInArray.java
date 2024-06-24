package programs;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] arr=new int[] {87,90,56,78,43,90};
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
			{
				max= arr[i];
			}
		}
System.out.println(max);
	}

}

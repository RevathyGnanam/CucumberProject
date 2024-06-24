package programs;

public class CountDuplicateArrays {

	public static void main(String[] args) {
	
		int[] arr = new int[] {3,5,6,7,8,8,9,9,3};
		 for(int i =0; i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 System.out.println("Duplicate elements-----"+ arr[i]);
					
				 }
					 
			 }
		 }
		// System.out.println("Duplicate elements-----"+ arr.length);
	}

}

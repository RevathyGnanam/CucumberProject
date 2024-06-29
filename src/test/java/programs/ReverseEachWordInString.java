package programs;

public class ReverseEachWordInString {
	
	public static void main(String[] args) {
		String givenstring = "Revathy is in depression";
		String reverseString = "";
		//Another Way to reverse each word
												//    0      1 2    3
		String[] words = givenstring.split(" "); // Revathy is in depression
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseString = reverseString+word.charAt(j);
				
			}
			reverseString=reverseString+" ";
			
		}
		System.out.println(reverseString);
		
		
//		String[] words = givenstring.split(" ");
//		String reverseString = "";
//		for(int i=0;i<words.length;i++) {
//			
//		String word = words[i];
//		String reverseword = "";
//		
//		for(int j=word.length()-1;j>=0;j--) {
//			reverseword=reverseword+word.charAt(j);
//		}
//		
//		reverseString =reverseString+reverseword+" ";
//			
//		}
//		
//		System.out.println(givenstring);
//		System.out.println(reverseString);
		
		
		
		
	}
	
}
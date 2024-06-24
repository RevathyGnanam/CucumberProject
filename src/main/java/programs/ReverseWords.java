package programs;

public class ReverseWords {

	public static void main(String[] args) {
		
		String words = "Revathy is in depression";
		String[] word = words.split(" ");
		String a="";
				
		for(int i=word.length-1;i>=0;i--) {
			
			a=a+word[i]+" ";
		}
		
		System.out.println(a);
	}

}

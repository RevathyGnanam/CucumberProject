package greentechprograms.StringPrograms;

public class PrinttheVowelsGetLength {

	public static void main(String[] args) {
		String text= "jack and jim went upto the hill";
		String vowels="";
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='a'|| text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u') {
				vowels=vowels+text.charAt(i);
			}
		}
		System.out.println("Printing the vowels: "+ vowels);
		System.out.println("Counting the vowels: "+ vowels.length());
	}

}

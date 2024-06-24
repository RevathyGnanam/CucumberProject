package greentechprograms.StringPrograms;

public class ConsonantVowelsCount {

	public static void main(String[] args) {
		String s ="Welcome";
		String vowelscount="";
		String consonantcount="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowelscount = vowelscount+Character.charCount(s.charAt(i));
			}
			else if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')) {
				consonantcount=consonantcount+Character.charCount(s.charAt(i));
			}
		}
		 
	System.out.println(vowelscount.length());
	System.out.println(consonantcount.length());
		

	}

}

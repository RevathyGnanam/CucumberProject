package greentechprograms.StringPrograms;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		String text= "jack and jim went upto the hill";
		String vowels="";
		for(int i=0;i<text.length();i++) {
			//need to remove only vowels and get the size of the string
			if(!(text.charAt(i)=='a' || text.charAt(i) =='e' || text.charAt(i) == 'i' || text.charAt(i) =='o' || text.charAt(i) =='u')){
				char ch = text.charAt(i);
				vowels=vowels+ch;
			}

		}
		System.out.println("print the vowels  "+ vowels);
		System.out.println("vowels size" +vowels.length());
	}

}

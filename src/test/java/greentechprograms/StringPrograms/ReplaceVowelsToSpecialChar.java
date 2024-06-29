package greentechprograms.StringPrograms;

public class ReplaceVowelsToSpecialChar {

	public static void main(String[] args) {
		String s= "Welcome to Java";
		String nstr="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			nstr = nstr+"*";
			}else {
				nstr =nstr+ch;
			}
				
		
		}
		System.out.println(nstr);
	}

}

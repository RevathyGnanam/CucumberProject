package greentechprograms.StringPrograms;

public class UpperAndLowerCaseCount {

	public static void main(String[] args) {
		String s ="Welcome To Online Class";
		//char[] text = s.toCharArray();
		String lowercase="";
		String uppercase="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
		if(Character.isUpperCase(ch)) {
			uppercase= uppercase+Character.charCount(ch);
		}
		if(Character.isLowerCase(ch)) {
			lowercase= lowercase+Character.charCount(ch);
		}
			
			
		}
		System.out.println("Upper Case count" + uppercase.length());
		System.out.println("Lower case count"  +lowercase.length());

	}

}

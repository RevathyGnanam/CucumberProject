package greentechprograms.StringPrograms;

public class CountSpecialCount {

	public static void main(String[] args) {
		String s = "Welcome To Java class @123";
		String capscount  ="";
		String smallcount ="";
		String numbercount="";
		String Specialchar="";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				capscount=capscount+Character.charCount(s.charAt(i));	
			}else if(Character.isLowerCase(s.charAt(i))) {
				smallcount =smallcount+ Character.charCount(s.charAt(i));
			}else if(Character.isDigit(s.charAt(i))) {
				numbercount=numbercount+Character.charCount(s.charAt(i));
			}else {
				Specialchar=Specialchar+Character.charCount(s.charAt(i));
				
			}
		}
System.out.println(capscount.length());
System.out.println(smallcount.length());
System.out.println(numbercount.length());
System.out.println(Specialchar.length());
	}

}

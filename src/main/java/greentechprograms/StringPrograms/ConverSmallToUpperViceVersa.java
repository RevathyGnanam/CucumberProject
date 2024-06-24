package greentechprograms.StringPrograms;

public class ConverSmallToUpperViceVersa {

	public static void main(String[] args) {
		String s ="Welcome";
		String nstr="";
		for(int i=0;i<s.length();i++) {
			char eachchar = s.charAt(i);
			if(Character.isUpperCase(eachchar)) {
				
				nstr=	nstr+Character.toLowerCase(eachchar);
			}
			else {
				nstr = nstr+Character.toUpperCase(eachchar);
			}
		}
System.out.println(nstr);
	}

}

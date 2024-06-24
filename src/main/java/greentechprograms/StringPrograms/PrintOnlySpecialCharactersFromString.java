package greentechprograms.StringPrograms;

public class PrintOnlySpecialCharactersFromString {

	public static void main(String[] args) {
		String text ="T_O m# 0&Jer @yy";
		String chrastring="";
		for(int i=0;i<text.length();i++) {
			if(!(Character.isLowerCase(text.charAt(i))||Character.isUpperCase(text.charAt(i))||Character.isDigit(text.charAt(i)))){
				chrastring = chrastring+ text.charAt(i);
			}
		}
		System.out.println(chrastring.trim());
	}

}

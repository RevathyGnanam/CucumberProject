package programs;

public class ReverseaString {

	public static void main(String[] args) {

		String givenstring = "Samy is a girl";
		String nstr = "";
		
		//for(int i=0;i<givenstring.length();i++) {
			  
		//	 nstr = givenstring.charAt(i)+nstr;
			
		//}

		//another way
		for(int i=givenstring.length()-1;i>=0;i--) {
			nstr=nstr+givenstring.charAt(i);
		}
		 System.out.println(nstr);


	}

}

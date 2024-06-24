package PDFPrograms;

public class ReverseaStringAndCheckPalindrome {

	public static void main(String[] args) {
		String s="DAwdsD";
		String reverseString="";
		for (int i = s.length()-1; i >=0; i--) {
			reverseString= reverseString+s.charAt(i);
			
		}
		System.out.println(reverseString);
		if(reverseString.equalsIgnoreCase(s)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}

	}

}

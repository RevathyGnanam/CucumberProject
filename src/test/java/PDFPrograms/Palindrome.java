package PDFPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int a = 121;
		int i=0,j=0;
		int temp=a;
		while(a>0) {
			i = a%10;
			j = i+(j*10);
			a = a/10;
		}
		if(temp==j) {
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}

	}

}

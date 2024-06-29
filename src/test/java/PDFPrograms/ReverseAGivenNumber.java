package PDFPrograms;

public class ReverseAGivenNumber {

	public static void main(String[] args) {
		int a=123456789;
		int i=0,j=0;
		int temp=a;
		while(a>0) {
		i=	a%10;
		j=i+(j*10);
		a=a/10;
		
		}
		
System.out.println("before reverse number"+temp);
System.out.println("after reverse number"+j);
	}

}

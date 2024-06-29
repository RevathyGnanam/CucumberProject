package PDFPrograms;

public class ProductOfDigits {

	public static void main(String[] args) {
		int a=24,i=0,j=0,temp=a;
		while(a>0) {
			i=a%10;
			j=i+(j*10);
			a=a/10;
		}
System.out.println(temp);
	}

}

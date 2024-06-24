package PDFPrograms;

public class SumAndcounttheDigits {

	public static void main(String[] args) {
		int a=23354654,sum=0,j=0,i=0,count=0;
		while(a>0) {
			i=a%10;
			sum=sum+i;
			j=i+(j*10);
			a=a/10;
			count++;			
		}
		System.out.println(sum);
		System.out.println(count);

	}

}

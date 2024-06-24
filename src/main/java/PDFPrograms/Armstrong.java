package PDFPrograms;

public class Armstrong {

	public static void main(String[] args) {
		int a=153,i=0,j=0;
		int temp =a;
		
		while(a>0) {
			i= a%10;
			j=j+(i*i*i);
			a=a/10;
		}
if(temp==j) {
	System.out.println("Its Armstrong");
}
else {
	System.out.println("Its not a Armstrong");
}
	}

}

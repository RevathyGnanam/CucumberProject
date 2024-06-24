package PDFPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a =0,b=1;
		
		for (int i = 0; i <5; i++) {
			int c= a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}


	}

}

package PDFPrograms;

public class PrintOddNumAndCount {

	public static void main(String[] args) {
		int count=0;
		for (int i = 0; i <=100; i++) {
			if(i%2!=0) {
				System.out.println("Odd number is:"+i);
				count++;
			}
		}
System.out.println("Count of odd number:"+count);
	}

}

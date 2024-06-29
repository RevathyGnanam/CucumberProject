package javaprograms;

public class StaticMethodUsingParseInt {

	
	public static void main(String[] args) {
		String a= "13";
		String b= "30";
		int c= Integer.parseInt(a);// change string to int
		int d= Integer.parseInt(b);
		System.out.println(c+d);
		display();// calling the function without creating the object in static function
		
	}	
	static int a = 90;
		public static void display()
		{
		System.out.println(a);	
		}
		
		
		
		
}

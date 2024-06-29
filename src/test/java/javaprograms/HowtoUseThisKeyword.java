package javaprograms;

public class HowtoUseThisKeyword {

	
	public static void main(String[] args) {
		//created a object from the same class and calling the methods
		HowtoUseThisKeyword bs = new HowtoUseThisKeyword();
		// Method overloading
		bs.createvideo("abcd",90);
		bs.createvideo("abcde");
		
		
	}	
	int num1; //Global or instance variable
	int run()
	{
		return 25;
	}
	//Method overloading concepts with different parameter
		public void createvideo(String createid, int num)
		{
			int num1 = 20;
			//this - If i mention any this keyword means, it will call current class global or instance varaible 
			System.out.println("video has created"+" " +createid +" " + num+" " + this.num1);
		}
		
		
		public void createvideo(String createid)
		{

			System.out.println("video has created"+" " +createid + this.run());
		}
		

}

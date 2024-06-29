package javaprograms;

public class CallingMethodsFromInsideClassConceptMethodOverloading {

	
	public static void main(String[] args) {
		//created a object from the same class and calling the methods
		CallingMethodsFromInsideClassConceptMethodOverloading bs = new CallingMethodsFromInsideClassConceptMethodOverloading();
		// Method overloading
		bs.createvideo("abcd",90);
		bs.createvideo("abcd");
		
		boolean best =bs.uploadingvideos();
		System.out.println(best);
		String givenstring =  bs.editvideo();
		System.out.println(givenstring);
		
	}	
	
	//Method overloading concepts with different parameter
		public void createvideo(String createid, int num)
		{
			System.out.println("video has created"+" " +createid +" " + num);
		}
		public void createvideo(String createid)
		{
			System.out.println("video has created"+" " +createid);
		}
		
		public boolean uploadingvideos() {
			return true;
		}
		
		public String editvideo() {
			return "facebook";
		}
		
	

}

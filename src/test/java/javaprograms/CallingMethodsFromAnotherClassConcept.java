package javaprograms;

public class CallingMethodsFromAnotherClassConcept {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my java world");
		
		BaseEpisode bs = new BaseEpisode(); //created a object from another class
		bs.createvideo();
		boolean best =bs.uploadingvideos();
		System.out.println(best);
		String givenstring =  bs.editvideo();
		System.out.println(givenstring);
		
		
		
		
		
	}

}

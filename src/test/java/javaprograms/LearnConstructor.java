package javaprograms;

public class LearnConstructor {

	
	public static void main(String[] args) {
		//created a object for parameterized constructor
		LearnConstructor bs = new LearnConstructor("Revathy",100);
		
		//created a object for default constructor
		LearnConstructor bs1 = new LearnConstructor();
		bs.display();
		bs1.display();
		
		
	}	
	String createid;
	int num;
	//Create a constructor with parameter
		public LearnConstructor(String createid1, int num1)
		{
		this.createid= createid1;
		this.num = num1;
				
		}
		//default constructor by using this keyword
		LearnConstructor(){
			this.num =200;
		}
		
		void display()
		{
			System.out.println(createid +" " +num);
		}
		
		
		
		
}

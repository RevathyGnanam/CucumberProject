package InheritanceConcepts;

public class BMW extends Bike {

	public static void main(String[] args) {
		BMW mybike = new BMW();
		Vehicle myVehicle = new Vehicle();
		mybike.applyBrake();
		mybike.applyride();
		mybike.displayScreen();
		mybike.hasDiscBrake();
		myVehicle.applyBrake();
		
		

	}
	
	public String displayScreen()
	{
		String color = "Red";
		return color;
	}
	

}

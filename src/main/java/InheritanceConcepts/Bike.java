package InheritanceConcepts;
import interfaceabstract.Axis;
public class Bike extends Vehicle {
	public void hasDiscBrake()
	{
		System.out.println("Disc brake is applied");
	}
	public void applyBrake()
	{
		System.out.println("new Brake is applied");
	}
	
}

package interfaceabstract;

public class Axis implements RBI {

	public void commonLoan() {
		int upiamount2 = RBI.upiAmount;
		System.out.println("Gnanam----------------"+upiamount2);
	}
	@Override
	public void freeLoan() {
	System.out.println("Revathy ---------------");	
		
	}

	@Override
	public void payLoan() {
		System.out.println("samyu ---------------");	
		
	}

}
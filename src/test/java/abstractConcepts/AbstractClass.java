package abstractConcepts;

public abstract class AbstractClass implements RBI {

	public void commonLoan() {
		int upiamount2 = RBI.upiAmount;
		System.out.println("Gnanam----------------"+upiamount2);
	}
	@Override
	public void freeLoan() {
	System.out.println("Revathy ---------------");	
		
	}
	public void goldLoan()
	{
		System.out.println("Gold loan accepted");
		
	}
	AbstractClass(){
		System.out.println("constructor loan accepted");	
	}
	}

	


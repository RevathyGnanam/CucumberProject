package interfaceabstract;

public interface RBI {
	int upiAmount= 100;
	void freeLoan();
	void payLoan();
	default void carLoan() {
		System.out.println("Car loan got accepted");
	}
	static void bikeLoan() {
		System.out.println("Bikeloan got accepted");
	}
	
	
	

}

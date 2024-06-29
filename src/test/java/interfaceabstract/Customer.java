package interfaceabstract;

public class Customer {

	public static void main(String[] args) {
		Axis myuser = new Axis();
		myuser.commonLoan();
		myuser.freeLoan();
		myuser.payLoan();
		myuser.carLoan(); //calling default function from interface
		RBI.bikeLoan();//calling static function from interface
		

	}

}

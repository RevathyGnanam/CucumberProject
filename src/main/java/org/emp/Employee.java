package org.emp;

public class Employee extends Project {
	 static int s=100;
	static void empId() {
			System.out.println("Employee ID");
		}
	void empName() {
		System.out.println("Employee Name");
	}
	void empDob() {
		System.out.println("Employee DOB");
	}
	void empPhone() {
		System.out.println("Employee Phone");
	}
	void empEmail() {
		System.out.println("Employee Email");
	}
	
	void empAddress() {
		System.out.println("Employee Address");
	}
	
	void companyAddress() {
		System.out.println("Company new address");
	}

	public static void main(String[] args) {
		
		empId();
		Employee emp = new Employee();
		emp.empAddress();
		emp.empDob();
		emp.empEmail();
		emp.empName();
		emp.empPhone();
		System.out.println("calling clients class");
		emp.clientName();
		System.out.println("calling company class");
		companyName();
		emp.companyAddress();
		emp.companyId();
//		System.out.println("calling project class");
//		emp.projectName();
//		int n2 = emp.n;
//		System.out.println(n2);
		System.out.println(emp.s);
	
		
	}

}

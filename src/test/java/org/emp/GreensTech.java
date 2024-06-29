package org.emp;

public class GreensTech {

	public GreensTech(int i) {
		System.out.println(i);
	}

	void greensOmr() {
		System.out.println("Greens OMR");
	}
	
	void greensAdayar() {
		System.out.println("greens Adayar");
	}
	
	void greensTambaram() {
		System.out.println("greens Tambaram");
	}
	
	void greensVelacherry() {
		System.out.println("greens velachery");
	}
	
	void greensAnnaNagar() {
		System.out.println("greens Anna nagar");
	}
	public static void main(String[] args) {
		GreensTech tech = new GreensTech(12);
		tech.greensAdayar();
		tech.greensAnnaNagar();
	}

}

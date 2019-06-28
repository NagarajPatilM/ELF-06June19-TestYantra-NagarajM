package com.testyantra.javaapp.assesment;

public class TestBank {

	public static void main(String[] args) {
		Bank b;
		b = new StateBankOfIndia();

		AtmMachine atm = new AtmMachine();
		atm.receive(b);

	}

}

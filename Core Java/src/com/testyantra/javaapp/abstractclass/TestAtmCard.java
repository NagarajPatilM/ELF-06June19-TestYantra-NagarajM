package com.testyantra.javaapp.abstractclass;

public class TestAtmCard {

	public static void main(String[] args) {
		Machine m = new Machine();
		Sbi s = new Sbi();
		m.slot(s);
	}
}

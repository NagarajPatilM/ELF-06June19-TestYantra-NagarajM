package com.testyantra.javaapp.overriding;

public class TestLuxuryVehicle {

	public static void main(String[] args) {
		LuxuryVehicle lux=new Porsche();
		Driver d=new Driver();
		
		d.status(lux);

	}

}

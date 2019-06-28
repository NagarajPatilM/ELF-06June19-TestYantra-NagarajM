package com.testyantra.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
public class CarWithFuel {
	double litre;

	public void setLitre(double litre) {
		this.litre = litre;
	}

	public static void main(String[] args) {
		CarWithFuel c = new CarWithFuel();
		c.setLitre(5);
		log.info("initial fuel is " + c.litre + " litres");

	}

}

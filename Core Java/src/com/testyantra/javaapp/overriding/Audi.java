package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Audi extends LuxuryVehicle {

	void drive() {
		log.info("hi, i'm driving audi");
	}
}

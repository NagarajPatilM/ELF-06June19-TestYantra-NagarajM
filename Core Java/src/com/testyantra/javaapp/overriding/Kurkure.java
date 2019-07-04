package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Kurkure extends Chips {
	
	void open() {
		log.info("opening kurkure");

	}

	void eat() {
		log.info("eating kurkure");
	}

}

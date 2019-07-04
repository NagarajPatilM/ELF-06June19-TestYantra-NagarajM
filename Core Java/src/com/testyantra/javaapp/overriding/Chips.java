package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Chips {

	void open() {
		log.info("opening chips");
	}

	void eat() {
		log.info("eating chips");
	}
}

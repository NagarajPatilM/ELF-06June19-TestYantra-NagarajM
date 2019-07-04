package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Coke {

	void open() {
		log.info("opening the bottle");
	}

	void drink() {
		log.info("drinking coke");

	}
}

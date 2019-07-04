package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Lays extends Chips {
	
	void open() {
		log.info("opening lays");
	}

	void eat() {
		log.info("eating lays");
	}

}

package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class MIPhone extends Phone {

	void call() {
		log.info("Thank you brother");
	}
}

package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Girl {

	void receive(Phone p) {
		if (p instanceof Iphone) {
			log.info("I love you");
		} else if (p instanceof MIPhone) {
			log.info("thank you brother");
		}
	}
}

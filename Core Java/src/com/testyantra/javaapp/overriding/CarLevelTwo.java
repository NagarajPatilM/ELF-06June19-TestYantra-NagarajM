package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class CarLevelTwo extends Car {

	void speed() {
		log.info("car moves at 100-150 kmph");
	}
}

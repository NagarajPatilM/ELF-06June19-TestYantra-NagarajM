package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class CarLevelThree extends Car {
	
	void speed() {
		log.info("car moves at 150-200 kmph");
	}
}

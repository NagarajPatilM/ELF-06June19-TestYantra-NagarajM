package com.testyantra.assessmentone;

import lombok.extern.java.Log;

@Log
public class ValidateTemperature {
	static void validate(double temp) throws Temparature {
		if (temp > 18) {
			throw new Temparature("warning");
		}
		else {
			log.info("temperature of the server room is normal");
		}
	}
}

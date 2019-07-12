package com.testyantra.assessmentone;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		try {
		ValidateTemperature.validate(36);
	}
		catch(Exception e) {
			log.info(" "+e);
			
		}

}
}

package com.testyantra.assessmentone;

import lombok.extern.java.Log;

@Log
public class Lays implements Chips {

	@Override
	public void process() {
		log.info("lays is delivered");
	}

}

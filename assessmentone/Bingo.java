package com.testyantra.assessmentone;

import lombok.extern.java.Log;

@Log
public class Bingo implements Chips {

	@Override
	public void process() {
		log.info("Bingo is delivered");
	}

}

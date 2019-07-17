package com.testyantra.xmlandconfig;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	@Override
	public void eat() {
		log.info(" eaing grass");
	}

	@Override
	public void makesound() {
		log.info("making donkey sound");
	}

}

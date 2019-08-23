package com.testyantra.xmlandconfig;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {

	@Override
	public void eat() {
		log.info("eating banana");
	}

	@Override
	public void makesound() {
		log.info("making monkey sound");
	}

}

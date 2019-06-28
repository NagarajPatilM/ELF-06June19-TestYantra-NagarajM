package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public class Hdfc implements AtmCard {

	public void validate() {
		log.info("validated using Hdfc");
	}

	public void getUserInfo() {
		log.info("got using hdfc");
	}

	public void deposit() {
		log.info("deposited using hdfc");

	}

}

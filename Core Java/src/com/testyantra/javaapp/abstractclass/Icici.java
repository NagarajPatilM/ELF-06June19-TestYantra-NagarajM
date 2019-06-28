package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public class Icici implements AtmCard {

	public void validate() {
		log.info("validated using Icici");
	}

	public void getUserInfo() {
		log.info("got using icici");
	}

	public void deposit() {
		log.info("deposited using Icici");

	}

}

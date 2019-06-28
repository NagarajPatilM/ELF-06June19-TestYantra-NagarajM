package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public class Sbi implements AtmCard {

	public void validate() {
		log.info("validated using sbi atm card");
	}

	public void getUserInfo() {
		log.info("got information using sbi atm card");
	}

	public void deposit() {
		log.info("money is deposited using sbi card");

	}

}

package com.testyantra.javaapp.assesment;

import lombok.extern.java.Log;

@Log
public class CanaraBank implements Bank {

	@Override
	public void printBankName() {
		log.info("Canara Bank ");
	}

}

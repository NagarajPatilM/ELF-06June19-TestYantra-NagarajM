package com.testyantra.javaapp.assesment;

import lombok.extern.java.Log;

@Log
public class HdfcBank implements Bank{

	@Override
	public void printBankName() {
		log.info(" Hdfc Bank");
	}
	

}

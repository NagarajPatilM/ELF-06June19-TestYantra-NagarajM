package com.testyantra.javaapp.assesment;

import lombok.extern.java.Log;

@Log
public class StateBankOfIndia implements Bank{
	@Override
	public void printBankName() {
		log.info("State Bank Of India ");
		
	}
	

}

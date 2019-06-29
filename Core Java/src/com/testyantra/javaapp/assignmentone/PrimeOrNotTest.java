package com.testyantra.javaapp.assignmentone;

import lombok.extern.java.Log;

@Log
public class PrimeOrNotTest {

	public static void main(String[] args) {
		int number = 5;
		String s = PrimeOrNot.isPrime(number);
		log.info("the given no. " + number + " is" + s);

	}

}

package com.testyantra.javaapp.assignmentone;

import lombok.extern.java.Log;

@Log
public class PrimeFrom1To100 {
	
	public static void toPrintPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				count++;
				break;
			}

		}
		if (count == 0 && num != 0) {
			log.info("the prime number is " + num);

		}
	}

}

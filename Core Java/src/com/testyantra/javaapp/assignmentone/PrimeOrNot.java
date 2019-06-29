package com.testyantra.javaapp.assignmentone;

public class PrimeOrNot {

	public static String isPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				count++;
				break;
			}

		}
		if (count == 0) {
			return " prime";
		} else {
			return " not prime";
		}
	}

}

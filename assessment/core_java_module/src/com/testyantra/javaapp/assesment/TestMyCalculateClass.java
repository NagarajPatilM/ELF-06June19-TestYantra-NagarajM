package com.testyantra.javaapp.assesment;

import lombok.extern.java.Log;

@Log
public class TestMyCalculateClass {

	public static void main(String[] args) {
		MyCalculateClass m = new MyCalculateClass();

		log.info("simple interest is " + m.toCalculateSI(1000, 2, 5));
		log.info("Factorial is " + m.toCalFact(5));

		int[] ar = { 55, 56, 78, 69, 89, 38 };
		log.info("percentage is " + m.calPercent(ar, 600));

	}

}

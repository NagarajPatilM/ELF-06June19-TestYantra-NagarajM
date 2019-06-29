package com.testyantra.javaapp.assignmentone;

import lombok.extern.java.Log;

@Log
public class DivisibleBySeven {

	public static void isDivisible(int num) {

		if (num % 7 == 0 && num!=0 && num%2!=0) {
			log.info("number is"+num);
		}
	}
}

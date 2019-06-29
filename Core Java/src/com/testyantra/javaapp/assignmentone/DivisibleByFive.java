package com.testyantra.javaapp.assignmentone;

import lombok.extern.java.Log;

@Log
public class DivisibleByFive {
	public static void isDivBy5(int num) {
		if (num % 5 == 0 && num % 2 == 0 && num != 0) {
			log.info("the no. is " + num);

		}

	}
}

package com.testyantra.javaapp.assignmentlambda;

import lombok.extern.java.Log;

@Log
public class AddTwoUsingLambda {

	public static void main(String[] args) {
		AddTwoInterface i = (a, b) -> {
			return a + b;
		};

		log.info("sum is " + i.addTwo(5, 6));

	}

}

package com.testyantra.javaapp.assignmentlambda;

import lombok.extern.java.Log;

@Log
public class FactorialUsingLambda {

	public static void main(String[] args) {
		FactorialInterface f = a -> {
			int fact = 1;
			while (a > 1)
				fact = fact * a--;
			return fact;
		};
		log.info(" " + f.toFact(6));

	}

}

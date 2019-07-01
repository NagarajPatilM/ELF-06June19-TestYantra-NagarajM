package com.testyantra.javaapp.assignmentlambda;

import lombok.extern.java.Log;

@Log
public class PrintNumbersUsingLambda {

	public static void main(String[] args) {

		PrintNumbersInterface p = a -> {
			log.info(" " + a);
		};

		for (int i = 0; i < 20; i++) {
			p.toPrint(i);
		}

	}

}

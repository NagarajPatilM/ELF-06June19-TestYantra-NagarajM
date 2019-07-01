package com.testyantra.javaapp.assignmentlambda;

import lombok.extern.java.Log;

@Log
public class SquareUsingLambda {

	public static void main(String[] args) {

		SquareInterface sq = num -> {
			return num * num;
		};

		log.info(" " + sq.toSquare(6));

	}

}

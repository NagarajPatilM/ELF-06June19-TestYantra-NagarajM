package com.testyantra.javaapp.assignmentlambda;

import lombok.extern.java.Log;

@Log
public class PrintMsgUsingLambda {

	public static void main(String[] args) {
		PrintMsgInterface p = () -> {
			log.info("hello world");
		};

		p.print();

	}
}

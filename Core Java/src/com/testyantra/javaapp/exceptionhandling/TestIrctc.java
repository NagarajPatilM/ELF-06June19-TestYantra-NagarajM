package com.testyantra.javaapp.exceptionhandling;

public class TestIrctc {

	public static void main(String[] args) {
		PayTm p = new PayTm();
		// VRL t=new VRL();
		Ganesh g = new Ganesh();
		    String network="good";
		try {
			p.book(199, g,network);
		} catch (ArithmeticException e) {
			System.out.println("please have a minimum of 200 rupees");
		}

	}
}

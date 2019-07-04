package com.testyantra.javaapp.overriding;

public class TestPenn {

	public static void main(String[] args) {

		Penn p = new Penn();
		Writer w = new Writer();
		w.receive(p);

	}

}

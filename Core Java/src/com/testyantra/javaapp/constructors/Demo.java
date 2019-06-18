package com.testyantra.javaapp.constructors;

class A {
	A() {
		System.out.println("hi, can i know who called me");
	}
}

public class Demo {

	public static void main(String[] args) {
		new A();
		new A();

	}

}

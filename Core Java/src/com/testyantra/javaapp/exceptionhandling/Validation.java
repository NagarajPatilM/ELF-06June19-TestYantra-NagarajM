package com.testyantra.javaapp.exceptionhandling;

public class Validation {
	void validate(String name) {
		int a = name.length();
		if (a >= 5) {
			System.out.println("valid name");
		} else {

		}
	}
}

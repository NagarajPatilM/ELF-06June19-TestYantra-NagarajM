package com.testyantra.javaapp.exceptionhandling;

public class InvalidNameException extends RuntimeException {
	private String message;

	public InvalidNameException(String message) {

		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidNameException [message=" + message + "]";
	}

}

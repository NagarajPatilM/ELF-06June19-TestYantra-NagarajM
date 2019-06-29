package com.testyantra.javaapp.assignmentone;

import lombok.extern.java.Log;

@Log
public class NumbersFrom5To1 {
	
	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i--) {
			log.info("number is " + i);
		}
	}
}

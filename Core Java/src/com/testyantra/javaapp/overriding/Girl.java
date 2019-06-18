package com.testyantra.javaapp.overriding;

public class Girl {
	
	void receive(Phone p) {
		if (p instanceof Iphone) {
			System.out.println("I love you");
		} else if (p instanceof MIPhone) {
			System.out.println("thank you brother");
		}
	}
}

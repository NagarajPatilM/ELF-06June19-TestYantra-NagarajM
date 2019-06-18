package com.testyantra.javaapp.overriding;

public class TestCoke {

	public static void main(String[] args) {
		Coke c=new Coke();
		Drinker d=new Drinker();
		d.receive(c);
		

	}

}

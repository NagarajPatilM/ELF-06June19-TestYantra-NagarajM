package com.testyantra.javaapp.casting;

public class TestClass {

	public static void main(String[] args) {
		Animal a = new Cow();
		System.out.println(a.x);
		a.run();
		Cow c = (Cow) a;
		c.run();
		System.out.println(c.y);
	}

}

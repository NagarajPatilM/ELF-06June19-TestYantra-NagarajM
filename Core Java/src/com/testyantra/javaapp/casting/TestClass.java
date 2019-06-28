package com.testyantra.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class TestClass {

	public static void main(String[] args) {

		Animal a = new Cow();
		log.info(" " + a.x);
		a.run();
		Cow c = (Cow) a;
		c.run();
		log.info(" " + c.y);
	}

}

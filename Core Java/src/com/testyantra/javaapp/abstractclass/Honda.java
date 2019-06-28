package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
abstract class Honda {
	void engine() {
		log.info("hi, I'm a engine method");
	}

	abstract void design();
}

package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Penn {
	void open() {
		log.info("open the pen");
	}

	void write() {
		log.info("write using the pen");
	}
}

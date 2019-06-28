package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public abstract class Casette {
	void play() {
		log.info("play method");
	}

	abstract void old();
}

package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public abstract class Google {
	void login() {
		log.info("login successful");
	}

	abstract void sendDoc();
}

package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public abstract class CD extends Casette {
	void finePlay() {
		log.info("fine");
	}
}

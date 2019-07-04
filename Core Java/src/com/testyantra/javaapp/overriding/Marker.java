package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen{
	
	void write() {
		log.info("writing using marker");
	}
}

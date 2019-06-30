package com.testyantra.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class PVR {

	synchronized void book() {

		for (int i = 0; i < 5; i++) {
			log.info(" " + i);
			try {
				wait();
			} catch (InterruptedException e) {
				log.severe("interruped exception occured");
			}
		}
	}

	synchronized void leaveMe() {
		notify();
	}

}

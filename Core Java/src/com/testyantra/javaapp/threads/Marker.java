package com.testyantra.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			log.info(" " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				log.severe("interruped exception occured");
			}
		}
	}

}

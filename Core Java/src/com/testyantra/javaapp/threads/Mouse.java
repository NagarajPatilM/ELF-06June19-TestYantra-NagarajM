package com.testyantra.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {

	String name;

	public Mouse(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			log.info(name + " " + " started");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				log.severe("interrupted exception occured");
			}

		}
		log.info(name + " " + " ended");

	}
}

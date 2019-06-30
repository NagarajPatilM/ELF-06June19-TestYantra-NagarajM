package com.testyantra.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			getName();
			log.info(" " + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				log.severe(" exception");
			}
		}
	}

}

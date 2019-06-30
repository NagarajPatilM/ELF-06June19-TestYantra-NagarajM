package com.testyantra.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class TestPen {

	public static void main(String[] args) {

		log.info("main started");
		Pen t1 = new Pen();
		t1.start();

		Pen t2 = new Pen();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			log.severe("Interrupted ecxeption occured");
		}
		log.info("main ended");
	}

}

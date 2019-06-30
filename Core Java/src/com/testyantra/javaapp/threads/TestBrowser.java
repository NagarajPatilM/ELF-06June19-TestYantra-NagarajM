package com.testyantra.javaapp.threads;

import lombok.extern.java.Log;

@Log
public class TestBrowser {

	public static void main(String[] args) {
		PVR p = new PVR();
		Browser t1 = new Browser(p);
		t1.start();

		Browser t2 = new Browser(p);
		t2.start();

		Browser t3 = new Browser(p);
		t3.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			log.severe("interrupted exception occured");
		}

		p.leaveMe();

	}

}

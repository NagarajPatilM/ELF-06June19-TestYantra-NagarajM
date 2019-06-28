package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public class Gmail extends Google {
	void sendDoc() {
		log.info("send upto 25MB of data");
	}
}

package com.testyantra.javaapp.abstractclass;

import lombok.extern.java.Log;

@Log
public class GoogleDrive extends Google {
	void sendDoc() {
		log.info("send upto 15GB of data");
	}
}

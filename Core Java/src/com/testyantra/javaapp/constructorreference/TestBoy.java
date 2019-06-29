package com.testyantra.javaapp.constructorreference;

import lombok.extern.java.Log;

@Log
public class TestBoy {

	public static void main(String[] args) {
		MyBoy mb = Boy::new;
		Boy b = mb.getBoy("nag", 23, 5.63);
		log.info(" " + b.name);

	}

}

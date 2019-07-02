package com.testyantra.jdbcapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection {

	@Override
	public void printMessage() {
		log.info("BBBBBB ");

	}

}

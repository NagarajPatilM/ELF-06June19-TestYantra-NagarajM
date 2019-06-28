package com.testyantra.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Bingo extends Chips {
	
	@Override
	void open() {
		log.info("i'm eating bingo ");
	}
}

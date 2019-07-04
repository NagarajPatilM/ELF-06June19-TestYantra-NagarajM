package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Iphone extends Phone{
	
	void call()
	{
		log.info("I love you");
	}

}

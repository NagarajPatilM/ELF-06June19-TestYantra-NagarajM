package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Porsche extends LuxuryVehicle{
	void drive()
	{
		log.info("Hi I'm driving Porsche");
	}

}

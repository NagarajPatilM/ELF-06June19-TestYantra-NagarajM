package com.testyantra.xmlandconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet {

	private String name;
	
	//@Qualifier("monkey")
	@Autowired
	private Animal animal;

	public void something() {
		animal.eat();
		animal.makesound();
	}

}

package com.testyantra.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet {

	private String name;
	@Autowired
	@Qualifier("monkey")
	private Animal animal;

	public void something() {
		animal.eat();
		animal.makesound();
	}

}

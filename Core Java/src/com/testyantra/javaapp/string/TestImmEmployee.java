package com.testyantra.javaapp.string;

import lombok.extern.java.Log;

@Log
public class TestImmEmployee {

	public static void main(String[] args) {
		ImmutableEmployee iemp = new ImmutableEmployee("nag", 23, 5.8, 'M', true);
		log.info("Employee name is " + iemp.getName());
		log.info("Employee age is " + iemp.getAge());
		log.info("Employee height is " + iemp.getHeight());

	}

}

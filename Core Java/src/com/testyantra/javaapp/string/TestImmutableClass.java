package com.testyantra.javaapp.string;

import lombok.extern.java.Log;

@Log
public class TestImmutableClass {

	public static void main(String[] args) {
		ImmutableClass i = new ImmutableClass("nagaraj", "nag");
		String s = i.getName();
		String s1 = i.getNickname();
		log.info("Name is "+s);
		log.info("Nick name is "+s1);

		ImmutableClass i1 = new ImmutableClass("virat", "king");
		log.info("Name is "+i1.getName());
		log.info("Nick name is "+i1.getNickname());

	}

}

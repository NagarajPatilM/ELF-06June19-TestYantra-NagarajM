package com.testyantra.javaapp.collection;

import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class LinkedHashSetDemoOne {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(18);
		lhs.add("java");
		lhs.add("scala");
		lhs.add("php");

		for (Object o : lhs) {
			log.info(" " + o);
		}
		System.out.println("welcome to \"test yantra\"!!!");

	}

}

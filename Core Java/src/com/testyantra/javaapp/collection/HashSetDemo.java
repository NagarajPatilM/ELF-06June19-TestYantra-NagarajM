package com.testyantra.javaapp.collection;

import java.util.HashSet;

import lombok.extern.java.Log;

@Log
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add("java");
		h.add("python");
		h.add("ruby");
		h.add(2.2);

		for (Object o : h) {
			log.info(" " + o);
		}

	}

}

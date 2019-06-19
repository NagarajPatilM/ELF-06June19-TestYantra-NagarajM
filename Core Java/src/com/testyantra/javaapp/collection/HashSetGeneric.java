package com.testyantra.javaapp.collection;

import java.util.HashSet;

public class HashSetGeneric {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("nag");
		h.add("Java");
		h.add("ruby");

		for (Object o : h) {
			System.out.println(o);
		}

	}

}

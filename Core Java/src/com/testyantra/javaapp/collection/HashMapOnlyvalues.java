package com.testyantra.javaapp.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class HashMapOnlyvalues {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("one", 1);
		h.put("two", 2);
		h.put("three", 3);
		h.put("four", 4);

		Collection<Integer> ci = h.values();
		Iterator<Integer> it = ci.iterator();
		while (it.hasNext()) {
			Integer v = it.next();
			log.info(" " + v);
		}

	}

}

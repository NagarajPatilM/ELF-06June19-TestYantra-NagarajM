package com.testyantra.javaapp.collection;

import java.util.HashMap;
import java.util.Set;

import lombok.extern.java.Log;

@Log
public class HashMapOnlyKeys {
	
	public static void main(String[] args) {

		HashMap<String, Integer> h = new HashMap<>();
		h.put("one", 1);
		h.put("two", 2);
		h.put("three", 3);
		h.put("four", 4);

	    Set<String> ts = h.keySet();
		for (String s : ts) {
			log.info(s);
		}
	}

}

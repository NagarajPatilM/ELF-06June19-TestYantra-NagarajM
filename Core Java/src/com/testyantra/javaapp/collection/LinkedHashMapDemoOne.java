package com.testyantra.javaapp.collection;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class LinkedHashMapDemoOne {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
		h.put("two", 2);
		h.put("one", 1);
		h.put("three", 3);
		h.put("four", 4);

		for (Map.Entry<String, Integer> hm : h.entrySet()) {
			String k = hm.getKey();
			int v = hm.getValue();
			log.info("key is " + k);
			log.info("value is " + v);
			log.info("----------");

		}
	}

}

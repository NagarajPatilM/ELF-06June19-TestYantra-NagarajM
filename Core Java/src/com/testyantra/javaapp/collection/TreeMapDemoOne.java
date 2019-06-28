package com.testyantra.javaapp.collection;

import java.util.Map;
import java.util.TreeMap;

import lombok.extern.java.Log;

@Log
public class TreeMapDemoOne {

	public static void main(String[] args) {
		TreeMap<String, Integer> h = new TreeMap<>();
		h.put("one", 1);
		h.put("two", 2);
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

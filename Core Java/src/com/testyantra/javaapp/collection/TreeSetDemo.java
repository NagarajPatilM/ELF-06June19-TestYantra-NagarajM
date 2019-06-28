package com.testyantra.javaapp.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add("nag");
		t.add("java");
		t.add("scala");
		for (Object o : t) {
			log.info(" " + o);
		}

	}

}

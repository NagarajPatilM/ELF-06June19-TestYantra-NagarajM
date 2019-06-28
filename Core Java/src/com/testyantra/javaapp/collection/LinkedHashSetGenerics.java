package com.testyantra.javaapp.collection;

import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class LinkedHashSetGenerics {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("java");
		lhs.add("scala");
		lhs.add("dotnet");
		lhs.add("mongodb");

		for (Object o : lhs) {
			log.info(" " + o);
		}

	}

}

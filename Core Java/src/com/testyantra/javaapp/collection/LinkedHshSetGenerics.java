package com.testyantra.javaapp.collection;

import java.util.LinkedHashSet;

public class LinkedHshSetGenerics {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("java");
		lhs.add("scala");
		lhs.add("dotnet");
		lhs.add("mongodb");

		for (Object o : lhs) {
			System.out.println(o);
		}

	}

}

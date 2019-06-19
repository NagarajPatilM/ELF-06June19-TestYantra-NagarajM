package com.testyantra.javaapp.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(18);
		lhs.add("java");
		lhs.add("scala");
		lhs.add("php");

		for (Object o : lhs) {
			System.out.println(o);
		}

	}

}

package com.testyantra.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("nag");
		a.add("raj");
		a.add("patil");
		a.add("m");

		Iterator<String> i = a.iterator();

		while (i.hasNext()) {
			String str = i.next();
			System.out.println(str);
		}

	}

}

package com.testyantra.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("patil");
		a.add(2.2);

		Iterator i = a.iterator();
		while (i.hasNext()) {
			
			Object o = i.next();
			System.out.println(o);
		}
	}

}

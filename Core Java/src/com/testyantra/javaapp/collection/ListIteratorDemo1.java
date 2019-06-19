package com.testyantra.javaapp.collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListIteratorDemo1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("patil");
		a.add("virat");
		a.add(2.2);
		ListIterator l = a.listIterator(a.size());
		Logger i = Logger.getLogger("hi");
		i.log(Level.INFO, "backward");
		while (l.hasPrevious()) {
			Object o = l.previous();
			System.out.println(o);
		}

	}
}

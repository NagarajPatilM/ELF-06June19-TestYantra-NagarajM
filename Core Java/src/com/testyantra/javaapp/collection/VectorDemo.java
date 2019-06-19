package com.testyantra.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		System.out.println("welcome to vector concept");
		System.out.println("for loop");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		System.out.println("for each loop");
		for (Integer o : v) {
			System.out.println(o);
		}

		System.out.println("iterator");
		Iterator<Integer> i = v.iterator();
		while (i.hasNext()) {
			Integer o = i.next();
			System.out.println(o);
		}

		System.out.println("list iterator");
		ListIterator<Integer> li = v.listIterator();
		while (li.hasNext()) {
			Integer o = li.next();
			System.out.println(o);
		}

		System.out.println("enumeration");
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer k = e.nextElement();
			System.out.println(k);
		}

	}

}

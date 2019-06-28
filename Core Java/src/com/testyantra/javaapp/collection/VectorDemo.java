package com.testyantra.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		log.info("welcome to vector concept");
		log.info("for loop");
		for (int i = 0; i < v.size(); i++) {
			log.info(" " + v.get(i));
		}

		log.info("for each loop");
		for (Integer o : v) {
			log.info(" " + o);
		}

		log.info("iterator");
		Iterator<Integer> i = v.iterator();
		while (i.hasNext()) {
			Integer o = i.next();
			log.info(" " + o);
		}

		log.info("list iterator");
		ListIterator<Integer> li = v.listIterator();
		while (li.hasNext()) {
			Integer o = li.next();
			log.info(" " + o);
		}

		log.info("enumeration");
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer k = e.nextElement();
			log.info(" " + k);
		}

	}

}

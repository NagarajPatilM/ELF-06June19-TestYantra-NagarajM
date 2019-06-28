package com.testyantra.javaapp.collection;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class LinkedListDemoOne {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(13);
		l.add("nag");
		l.add("raj");
		l.add(2.28);
		l.add('a');

		Logger logger = Logger.getLogger("virat");
		logger.log(Level.INFO, "for loop");
		for (int i = 0; i < l.size(); i++) {
			log.info(" " + l.get(i));
		}
		logger.log(Level.INFO, "for each loop");
		for (Object o : l) {
			log.info(" " + o);
		}
		logger.log(Level.INFO, "using iterator");
		Iterator i = l.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			log.info(" " + o);
		}
		logger.log(Level.INFO, "using list iterator");
		ListIterator li = l.listIterator();

		while (li.hasNext()) {
			Object o = li.next();
			log.info(" " + o);
		}
		logger.log(Level.INFO, "using list iterator backwards");
		while (li.hasPrevious()) {
			Object o = li.previous();
			log.info(" " + o);
		}

	}

}

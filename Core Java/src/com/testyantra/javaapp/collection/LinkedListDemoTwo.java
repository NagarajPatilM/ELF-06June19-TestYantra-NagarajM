package com.testyantra.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class LinkedListDemoTwo {

	public static void main(String[] args) {
		
		LinkedList<Character> l = new LinkedList<>();
		l.add('n');
		l.add('a');
		l.add('g');
		l.add('a');
		l.add('r');
		l.add('a');
		l.add('j');

		log.info("for loop");
		for (int i = 0; i < l.size(); i++) {
			log.info(" " + l.get(i));
		}

		log.info("for each loop");
		for (Character o : l) {
			log.info(" " + o);
		}

		log.info("iterator");
		Iterator<Character> i = l.iterator();
		while (i.hasNext()) {
			Character o = i.next();
			log.info(" " + o);
		}

		log.info("list iterator");
		ListIterator<Character> li = l.listIterator();
		while (li.hasNext()) {
			Character o = li.next();
			log.info(" " + o);
		}

	}

}

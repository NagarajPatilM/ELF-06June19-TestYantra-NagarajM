package com.testyantra.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<Character> l = new LinkedList<>();
		l.add('n');
		l.add('a');
		l.add('g');
		l.add('a');
		l.add('r');
		l.add('a');
		l.add('j');
		
		System.out.println("for loop");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("for each loop");
		for (Character o : l) {
			System.out.println(o);
		}
		
		System.out.println("iterator");
		Iterator<Character> i = l.iterator();
		while (i.hasNext()) {
			Character o = i.next();
			System.out.println(o);
		}
		
		System.out.println("list iterator");
		ListIterator<Character> li = l.listIterator();
		while (li.hasNext()) {
			Character o = li.next();
			System.out.println(o);
		}

	}

}

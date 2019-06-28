package com.testyantra.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class GenericIterator {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(2);
		a.add(2);
		a.add(37838);

		Iterator<Integer> i = a.iterator();
		while (i.hasNext()) {
			Integer in = i.next();
			log.info(" " + in);
		}

	}

}

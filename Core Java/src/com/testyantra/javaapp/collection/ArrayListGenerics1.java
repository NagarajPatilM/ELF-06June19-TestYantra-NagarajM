package com.testyantra.javaapp.collection;

import java.util.ArrayList;
import java.util.logging.Level;

import lombok.extern.java.Log;

@Log
public class ArrayListGenerics1 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(2);
		a.add(2);
		for (Integer o : a) {
			log.info(" " + o);
		}

		log.log(Level.INFO, "program ends");

		// for (int i = 0; i < a.size(); i++) { l.log(Level.INFO, "hddh"); }
	}
}

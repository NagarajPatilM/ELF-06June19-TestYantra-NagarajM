package com.testyantra.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListt {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(200);
		a.add("nagraj");
		a.add(2.28);
		log.info(" " + a);
	}

}

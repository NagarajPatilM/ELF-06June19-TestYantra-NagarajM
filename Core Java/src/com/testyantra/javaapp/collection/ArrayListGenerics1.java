package com.testyantra.javaapp.collection;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListGenerics1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(2);
		a.add(2);
		for (Integer o : a) {
			System.out.println(o);
		}
		
		Logger l = Logger.getLogger("virat");
		l.log(Level.INFO, "44");
		
		for (int i = 0; i < a.size(); i++) {
			//System.out.println(a.get(i));
			l.log(Level.INFO, "hddh", a.get(i));
		}
	}

}

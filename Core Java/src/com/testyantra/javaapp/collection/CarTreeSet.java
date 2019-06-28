package com.testyantra.javaapp.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class CarTreeSet {

	public static void main(String[] args) {
		TreeSet<Car> t = new TreeSet<>();
		Car c1 = new Car("lamborghioni", "l", 30000000, 4.8);
		Car c2 = new Car("audi", "a", 20000000, 4.5);
		Car c3 = new Car("nexon", "tata", 1000000, 4.2);
		Car c4 = new Car("baleno", "maruti-suzuki", 800000, 4.12);

		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);

		for (Car c : t) {
			log.info(" car name is " + c.name);
			log.info(" car brand is " + c.brand);
			log.info("car cost is " + c.cost);
			log.info("car rating is  " + c.rating);
			System.out.println("--------------");

		}

	}

}

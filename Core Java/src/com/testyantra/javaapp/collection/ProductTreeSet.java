package com.testyantra.javaapp.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class ProductTreeSet {

	public static void main(String[] args) {
		TreeSet<Product> t = new TreeSet<>();
		Product p1 = new Product("iphone", 200000, 4.2);
		Product p2 = new Product("xiaomi", 50000, 4.1);
		Product p3 = new Product("samsung", 10000, 3.2);
		Product p4 = new Product("oneplus", 100000, 4.0);

		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);

		for (Product p : t) {
			log.info(" product cost is " + p.cost);
			log.info("product rating is " + p.rating);
			log.info("product name is " + p.name);
			log.info("--------------");

		}

	}

}

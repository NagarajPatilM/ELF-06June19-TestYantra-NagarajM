package com.testyantra.javaapp.constructorreference;

import lombok.extern.java.Log;

@Log
public class TestProduct {

	public static void main(String[] args) {

		ProductInterface tp = Product::new; // mapping Functional Interface(ProductInterface) to Constructor
		Product p = tp.getDetails("iphone", "apple", 50000);
		log.info(" " + p);

	}

}

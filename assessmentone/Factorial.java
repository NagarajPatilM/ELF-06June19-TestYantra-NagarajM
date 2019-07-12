package com.testyantra.assessmentone;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class Factorial {

	public static void main(String[] args) {
		Function<Integer, Integer> fac = a -> {
			int fact = 1;
			while (a > 1) {
				fact = fact * a--;
			}
			return fact;
		};
		Integer a=5;
		log.info("" + fac.apply(5));
		int b=fac.apply(5);
		int c=b+5;
		log.info(" "+c);
	}

}

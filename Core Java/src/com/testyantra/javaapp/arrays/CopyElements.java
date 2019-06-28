package com.testyantra.javaapp.arrays;

import lombok.extern.java.Log;

@Log
public class CopyElements {

	public static void main(String[] args) {

		int[] a1 = { 5, 6, 2, 1, 4 };
		int[] a2 = { 30, 40, 50, 60, 70, 80 };
		System.arraycopy(a1, 0, a2, 2, a1.length - 1);
		for (int i = 0; i < a2.length; i++) {
			log.info(" " + a2[i]);

		}
	}
}

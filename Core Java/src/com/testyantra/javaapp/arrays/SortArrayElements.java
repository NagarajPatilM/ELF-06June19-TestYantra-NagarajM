package com.testyantra.javaapp.arrays;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class SortArrayElements {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 3, 7, 9 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			log.info(" " + a[i]);
		}
	}
}

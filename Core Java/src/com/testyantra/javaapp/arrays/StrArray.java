package com.testyantra.javaapp.arrays;

import lombok.extern.java.Log;

@Log
public class StrArray {

	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "nag";
		str[1] = "raj";
		str[2] = "patil";
		for (int i = 0; i < str.length; i++) {
			log.info(str[i]);
		}

	}

}

package com.testyantra.javaapp.arrays;

import lombok.extern.java.Log;

@Log
public class CharArray {

	public static void main(String[] args) {
		char[] ch = new char[4];
		ch[0] = 'n';
		ch[1] = 'a';
		ch[2] = 'g';
		ch[3] = 'a';
		for (int i = ch.length - 1; i >= 0; i--) {
			log.info(" " + ch[i]);

			if (ch[i] == 4) {
				log.info("default value");
			}

		}
	}

}

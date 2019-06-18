package com.testyantra.javaapp.arrays;

public class CharArray {

	public static void main(String[] args) {
		char[] ch = new char[5];
		ch[0] = 'n';
		ch[1] = 'a';
		ch[2] = 'g';
		ch[3] = 'a';
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);

			if (ch[i] == 4) {
				System.out.println("default value");
			}

		}
	}

}

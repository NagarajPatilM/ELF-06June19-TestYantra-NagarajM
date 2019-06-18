package com.testyantra.javaapp.casting;

public class TestChips {

	public static void main(String[] args) {
		Chips c = new Bingo();
		Bingo b = (Bingo) c;
		b.open();

		Chips c1 = new Lays();
		Lays l = (Lays) c1;

	}

}

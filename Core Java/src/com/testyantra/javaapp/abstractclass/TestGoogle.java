package com.testyantra.javaapp.abstractclass;

public class TestGoogle {

	public static void main(String[] args) {
		Browser b = new Browser();
		Gmail g = new Gmail();
		b.open(g);

	}

}

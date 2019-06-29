package com.testyantra.javaapp.constructorreference;

public class TestPen {

	public static void main(String[] args) {
		PenInterface p = Pen::new;
		p.getPen();
	}

}

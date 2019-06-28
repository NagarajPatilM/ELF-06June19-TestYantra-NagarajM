package com.testyantra.javaapp.assesment;

import lombok.extern.java.Log;
@Log
public class TestBmi {

	public static void main(String[] args) {
		
		BmiInterface c = (a, b) -> {
			double bmi = (a / (b * b));

			if (bmi < 18) {
				return "not normal";
			}
			else if (bmi > 18 && bmi < 25) {
				return "normal";
			} else {
				return "obesity";
			}
		};
		String str=c.bmiResult(5.6, 65.4);
		log.info(" result is "+str);

	}
}

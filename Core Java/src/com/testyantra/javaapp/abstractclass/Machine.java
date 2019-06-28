package com.testyantra.javaapp.abstractclass;

public class Machine {

	void slot(AtmCard a) {
		a.validate();
		a.getUserInfo();
	}
}

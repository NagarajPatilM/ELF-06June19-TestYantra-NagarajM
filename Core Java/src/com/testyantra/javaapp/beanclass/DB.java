package com.testyantra.javaapp.beanclass;

import lombok.extern.java.Log;

@Log
public class DB {
	void receive(Employee e) {
		log.info("welcome to employee db");
		log.info("eid is " + e.getEid());
		log.info("ename is " + e.getName());

	}
}

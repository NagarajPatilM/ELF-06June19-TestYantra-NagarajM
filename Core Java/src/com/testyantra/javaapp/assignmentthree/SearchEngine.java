package com.testyantra.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
public class SearchEngine {
	
	void search(Employee e) {
		log.info("employee name is " + e.getName());
		log.info("employee name is " + e.getId());
	}

}

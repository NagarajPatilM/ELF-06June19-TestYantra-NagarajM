package com.testyantra.javaapp.assesment;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class MobileDetails {

	static void getMobileDetails(ArrayList<BeanMobile> a) {
		for (int i = 0; i < a.size(); i++) {
			log.info("Mobile Brand is " + (a.get(i)).getBrand());
			log.info("Mobile cost is " + (a.get(i)).getCost());
			log.info("Mobile Ram is  " + (a.get(i)).getRam());
			log.info(" =================================");
		}

	}

}

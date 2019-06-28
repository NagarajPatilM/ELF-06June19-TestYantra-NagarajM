package com.testyantra.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class ArrayListGenerics {

	public static void main(String[] args) {
	
			ArrayList<Double> a = new ArrayList<>();
			a.add(100.0);
			a.add(200.0);
			a.add(2.2);
			a.add(2.28);
			log.info(" "+a);
		}
	}



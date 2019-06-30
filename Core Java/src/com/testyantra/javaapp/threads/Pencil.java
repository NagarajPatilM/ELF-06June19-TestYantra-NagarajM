package com.testyantra.javaapp.threads;

import java.util.concurrent.Callable;

public class Pencil implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 5;
	}

}

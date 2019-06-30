package com.testyantra.javaapp.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class TestPencil {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Pencil p = new Pencil();
		FutureTask<Integer> ft = new FutureTask<>(p);
		Thread t1 = new Thread(ft);
		t1.start();
		int i = ft.get();
		log.info(" " + i);

	}

}

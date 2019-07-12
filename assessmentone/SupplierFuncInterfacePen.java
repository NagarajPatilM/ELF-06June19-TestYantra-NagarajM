package com.testyantra.assessmentone;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class SupplierFuncInterfacePen {

	public static void main(String[] args) {
		Supplier<Pen> s=()->new Pen();
		
		log.info(""+s.get().getClass());
	}

}

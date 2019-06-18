package com.testyantra.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
       File f=new File("nags .java");
       try {
		boolean res=f.createNewFile();
		System.out.println("result is "+res);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}

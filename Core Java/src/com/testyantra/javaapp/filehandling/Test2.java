package com.testyantra.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
	       File f=new File("programsss/javaa/rubyy");
	       
			boolean res=f.mkdirs();
			System.out.println("result is "+res);
		
	}
}

package com.testyantra.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		String msg="india  say never";
		byte[] b=msg.getBytes();
       try {
 		FileOutputStream f=new FileOutputStream("myfile.txt",true);
 		f.write(b);
 		f.close();
 		System.out.println("data is written");
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
       
	}

}

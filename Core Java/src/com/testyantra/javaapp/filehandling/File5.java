package com.testyantra.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File5 {

	public static void main(String[] args) {
        try {
			FileInputStream f=new FileInputStream("nagu.txt");
			
			int i;
			
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}

}

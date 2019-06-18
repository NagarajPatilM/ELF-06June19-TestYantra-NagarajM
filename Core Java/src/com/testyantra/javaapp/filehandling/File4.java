package com.testyantra.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class File4 {

	public static void main(String[] args) {
String s="india india";
char[] ch=s.toCharArray();

try {
	FileWriter f=new FileWriter("nagu.txt");
	f.write(ch);
	f.flush();
	f.close();
	System.out.println("done!!");
} catch (IOException e) {
	e.printStackTrace();
}
	}

}

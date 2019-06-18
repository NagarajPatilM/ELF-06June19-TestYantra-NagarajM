package com.testyantra.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FlleHandlingExample {

	public static void main(String[] args) {
try {
	FileUtils.writeStringToFile(new File("naga.txt"), "this is my file");
	System.out.println("file created");
} catch (IOException e) {
	e.printStackTrace();
}
	}

}

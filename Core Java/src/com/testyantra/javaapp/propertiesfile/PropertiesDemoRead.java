package com.testyantra.javaapp.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PropertiesDemoRead {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("demo.properties");
			Properties p = new Properties();
			p.load(fis);

			String name = p.getProperty("Firstname");
			log.info(" " + name);

		} catch (FileNotFoundException e) {
			log.severe("Couldn't able to find the file ");
		} catch (IOException e) {
			log.severe("IOException occured");
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					log.severe("Couldn't able to close the stream");
				}
			}

		}
	}

}

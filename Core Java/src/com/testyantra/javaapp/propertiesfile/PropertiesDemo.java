package com.testyantra.javaapp.propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PropertiesDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("demo.properties");

			Properties p = new Properties();
			p.setProperty("Firstname", "Nagaraj ");
			p.setProperty("Lastname", "M ");
			p.setProperty("CompanyName", "TestYantra ");
			p.setProperty("address", "basavanagudi");

			p.store(fos, "company details");

			log.info("created properties file");

		} catch (FileNotFoundException e) {
			log.severe("Could'nt able to find a file  ");
		} catch (IOException e) {
			log.severe("IOException occured ");
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					log.info("Could'nt able to close the stream");
				}
			}

		}

	}

}

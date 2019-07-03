package com.testyantra.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {

	private static PropertiesUtil util = null;
	Properties prop = null;

	private PropertiesUtil() throws Exception {

		prop = new Properties();
		prop.load(new FileInputStream("ConfidentialDetils.properties"));

	}

	public static PropertiesUtil getPropertiesUtil() throws Exception {
		if (util == null) {
			util = new PropertiesUtil();

		}
		return util;

	}

	public String getProperty(String key) {
		return prop.getProperty("key");
	}

}

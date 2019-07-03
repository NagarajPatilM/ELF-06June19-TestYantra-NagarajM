package com.testyantra.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Properties;

public class ConnectionPool {

	private ArrayList<Connection> pool;
	private int poolSize;
	private String dburl;
	private String userNM;
	private String password;
	private String driverclassNm;
	private Connection con = null;
	static ConnectionPool poolRef = null;
	
	private ConnectionPool() throws Exception {
		loadProperties();
		initializePool();
	}// End of constructor

	

	private void initializePool() throws Exception {
		
		pool = new ArrayList();
		Connection con = null;
		Class.forName(driverclassNm);
		for (int i = 0; i < poolSize; i++) {

			con = DriverManager.getConnection(dburl, userNM, password);
			pool.add(con);
		}

	}

	private void loadProperties() throws Exception {

		FileInputStream fis = new FileInputStream("ConfidentialDetils.properties");
		Properties prop = new Properties();
		prop.load(fis);

		poolSize = Integer.parseInt(PropertiesUtil.getPropertiesUtil().getProperty(POOLSIZE));
		userNM = PropertiesUtil.getPropertiesUtil().getProperty(USERNAME);
		password = PropertiesUtil.getPropertiesUtil().getProperty(PASSWORD);
		dburl = PropertiesUtil.getPropertiesUtil().getProperty(DBURL);
		driverclassNm = PropertiesUtil.getPropertiesUtil().getProperty(DRIVER_CLASS_NAME);

	}

	
	public static ConnectionPool getConnectionPool() throws Exception {
		
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

}// End of class

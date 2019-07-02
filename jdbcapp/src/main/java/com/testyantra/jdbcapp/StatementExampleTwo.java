package com.testyantra.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class StatementExampleTwo {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			// 1. Load the driver
			/*
			 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
			 * 
			 * DriverManager.deregisterDriver(driver);
			 */

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();

			}
			// 2. Get the DB connection via. driver
			// String dburl =
			// "jdbc:mysql://10.10.13.105:3306/techchefs_db?user=root&password=root";
			// con = DriverManager.getConnection(dburl);

			String dburl = "jdbc:mysql://localhost:3306/testyantra_db";
			con = DriverManager.getConnection(dburl, "root", "root");
			log.info(" " + con.getClass());

			// 3.Issue SQL query via connection
			String query = "insert into training_info values(4,'java','2 months','elf')";
			stmt = con.createStatement();

			// 4.Process the results returned by SQL query
			int a = stmt.executeUpdate(query);

			if (a != 0) {
				log.info("profile updated " + a);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 5. close all the JDBC objects
		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

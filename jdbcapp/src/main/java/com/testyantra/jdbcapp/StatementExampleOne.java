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
public final class StatementExampleOne {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

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

			// 3.Issue SQL query via connection
			String query = "select * from emp_info " + "where id=2";
			log.info(" " + query);
			stmt = con.createStatement();

			// 4.Process the results returned by SQL query
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				log.info("id is            ========>" + rs.getInt(1));
				log.info("name is          ========>" + rs.getString(2));
				log.info("Gender is        ========> " + rs.getString("gender"));
				log.info(" salary is       ========> " + rs.getString("salary"));
				log.info("phone no is      ========>" + rs.getInt("phone"));
				log.info(" age is          ========>" + rs.getInt("age"));
				log.info("dob is           ========> " + rs.getDate("dob"));
				log.info("designation is   ========> " + rs.getString("designation"));
				log.info("email id is      ========>" + rs.getString("email"));
				log.info("Hiredate  is     ========> " + rs.getDate("hiradate"));
				log.info("dept id is       ========> " + rs.getInt("dept_id"));

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
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

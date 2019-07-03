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
public final class JDBCProgramForAWSDB {

	public static void main(String[] args) {

		String dburl = "jdbc:mysql://mysqltyss.cwj4ekfr79xc.ap-south-1.rds.amazonaws.com:3306/mysqltyss";
		String query = "select * from emp_info";

		try (Connection con = DriverManager.getConnection(dburl, "root", "Virat1833");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			/*
			 * String dburl =
			 * "jdbc:mysql://10.10.13.105:3306/techchefs_db?user=root&password=root"; con =
			 * DriverManager.getConnection(dburl);
			 */

			while (rs.next()) {
				log.info("id is            ========>" + rs.getInt("id"));
				log.info("name is          ========>" + rs.getString("name"));
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
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

package com.testyantra.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class ConnectionPoolTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;

		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();

			// 3.Issue SQL query via connection
			String query = "select * from emp_info";
			stmt = con.createStatement();

			// 4.Process the results returned by SQL query
			rs = stmt.executeQuery(query);
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
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 5. close all the JDBC objects
		finally {
			try {

				pool.returnConnectionToPool(con);
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

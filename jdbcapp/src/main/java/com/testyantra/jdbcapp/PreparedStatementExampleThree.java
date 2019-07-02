package com.testyantra.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class PreparedStatementExampleThree {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rs;

		try {

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();

			}
			// 2. Get the DB connection via. driver

			String dburl = "jdbc:mysql://localhost:3306/testyantra_db";
			con = DriverManager.getConnection(dburl, "root", "root");
			log.info(" " + con.getClass());

			// 3.Issue SQL query via connection

			String query = "insert into emp_info values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			pstmt.setInt(5, Integer.parseInt(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setInt(7, Integer.parseInt(args[6]));
			pstmt.setString(8, args[7]);
			pstmt.setString(9, args[8]);
			pstmt.setString(10, args[9]);
			pstmt.setString(11, (args[10]));
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));

			rs = pstmt.executeUpdate();

			// 4.Process the results returned by SQL query

			if (rs != 0) {
				log.info(" profile updated");
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

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

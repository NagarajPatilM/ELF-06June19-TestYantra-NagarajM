package com.testyantra.jdbcapp.commons;

public class MainMethodClass {

	public static void main(String[] args) {

		Connection con = DriverManager.getConnection(args[0]);
		con.printMessage();
	}

}

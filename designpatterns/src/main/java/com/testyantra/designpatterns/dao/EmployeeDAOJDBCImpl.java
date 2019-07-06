package com.testyantra.designpatterns.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.testyantra.designpatterns.beans.EmployeeInfoBean;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class EmployeeDAOJDBCImpl implements EmployeeDAO{

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfoBeans() {

		String dburl
		= "jdbc:mysql://localhost:3306/testyantra_db";
		String query = "select * from emp_info";

		try (Connection con = DriverManager.getConnection(dburl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfoBean> beans = new ArrayList<>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setGender(rs.getString("gender"));
				bean.setSalary(rs.getDouble("salary"));
				bean.setPhoneNo(rs.getInt("phone"));
				bean.setAge(rs.getInt("age"));
				bean.setDob(rs.getDate("dob"));
				bean.setDesignation(rs.getString("designation"));
				bean.setEmail(rs.getString("email"));
				bean.setHiredate(rs.getDate("hiredate"));
				bean.setDepartmentId(rs.getInt("dept_id"));
				beans.add(bean);

			}
			return beans;
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}// End of getAllEmployeeInfoBeans

	public EmployeeInfoBean getEmployeeInfo(String id) {

		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}

	} // End of getEmployeeInfo

	public EmployeeInfoBean getEmployeeInfo(int id) {

		EmployeeInfoBean bean = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

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

			String query = "select * from emp_info " + "where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			// 4.Process the results returned by SQL query
			bean = new EmployeeInfoBean();

			while (rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setGender(rs.getString("gender"));
				bean.setSalary(rs.getDouble("salary"));
				bean.setPhoneNo(rs.getInt("phone"));
				bean.setAge(rs.getInt("age"));
				bean.setDob(rs.getDate("dob"));
				bean.setDesignation(rs.getString("designation"));
				bean.setEmail(rs.getString("email"));
				bean.setHiredate(rs.getDate("hiredate"));
				bean.setDepartmentId(rs.getInt("dept_id"));
			}
			return bean;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		// 5. close all the JDBC objects
		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// End of getEmployeeInfo

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
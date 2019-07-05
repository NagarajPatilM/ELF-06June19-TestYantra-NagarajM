package com.testyantra.designpatterns;

import java.util.ArrayList;

import com.testyantra.designpatterns.beans.EmployeeInfoBean;
import com.testyantra.designpatterns.dao.EmployeeDAO;
import com.testyantra.designpatterns.dao.EmployeeDAOFactory;
import com.testyantra.designpatterns.dao.EmployeeDAOHibernateImpl;
import com.testyantra.designpatterns.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {

	public static void main(String[] args) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("2"));

		/*
		 * ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfoBeans(); for
		 * (EmployeeInfoBean bean : beans) { printInfo(bean); }
		 */
	}// End of main

	private static void printInfo(EmployeeInfoBean bean) {
		if (bean != null) {

			log.info(" Name : " + bean.getName());
			log.info(" Id : " + bean.getId());
			log.info(" Age : " + bean.getAge());
			log.info(" Account No : " + bean.getAccountNo());
			log.info(" Email : " + bean.getEmail());
			log.info(" Gender :  " + bean.getGender());
			log.info(" Phone No : " + bean.getPhoneNo());
			log.info(" Manager Id : " + bean.getManagerId());
			log.info(" Dob :" + bean.getDob());
			log.info(" " + bean.getHiredate());
			log.info(" " + bean.getDesignation());
		}

	}
}

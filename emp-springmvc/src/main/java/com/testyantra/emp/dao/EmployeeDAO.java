package com.testyantra.emp.dao;

import java.util.ArrayList;
import java.util.List;

import com.testyantra.empspringmvc.bean.EmployeeInfoBean;



public interface EmployeeDAO {
	  List<EmployeeInfoBean> getAllEmployeeInfo();
	  EmployeeInfoBean getEmployeeInfo(String id);
	  EmployeeInfoBean getEmployeeInfo(int id);
	  boolean createEmployeeInfo(EmployeeInfoBean bean);
	  boolean updateEmployeeInfo(EmployeeInfoBean bean);
	  boolean deleteEmployeeInfo(int id);
	  boolean deleteEmployeeInfo(String id);
	ArrayList<EmployeeInfoBean> getEmployeeIds(int id);
}

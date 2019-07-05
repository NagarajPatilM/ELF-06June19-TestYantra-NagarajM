package com.testyantra.designpatterns.dao;

import java.util.ArrayList;

import com.testyantra.designpatterns.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfoBeans();

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

}

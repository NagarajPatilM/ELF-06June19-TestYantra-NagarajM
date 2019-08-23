package com.testyantra.springmvc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testyantra.beans.EmpInfo;

import lombok.extern.java.Log;

@Log
public class EmpInfoTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		/*
		 * EmpInfo empInfo = (EmpInfo) applicationContext.getBean("empInfo"); // 1st
		 * time
		 * 
		 * log.info("Enter the salary : "); empInfo.setSalary(sc.nextDouble());
		 * sc.nextLine(); log.info("Enter tne name : "); empInfo.setName(sc.nextLine());
		 * 
		 * EmpInfo empInfoo = (EmpInfo) applicationContext.getBean("empInfo"); // 2nd
		 * time
		 * 
		 * log.info("Enter the salary : "); empInfoo.setSalary(sc.nextDouble());
		 * sc.nextLine(); log.info("Enter tne name : ");
		 * empInfoo.setName(sc.nextLine());
		 * 
		 * log.info("Emplooyee salary : " + empInfo.getSalary());
		 * log.info("Employee name : " + empInfo.getName());
		 * 
		 * 
		 * log.info("Emplooyee salary : " + empInfoo.getSalary());
		 * log.info("Employee name : " + empInfoo.getName());
		 * log.info("first object add "+empInfo);
		 * log.info("second object add "+empInfoo);
		 */
		
		//EmpInfo empInfoo=(EmpInfo) applicationContext.getBean("empInfo");
		//log.info("Emplooyee salary : " + empInfo.getSalary());
		//log.info("Employee name : " + empInfo.getName());
		
		//((AbstractApplicationContext)applicationContext).close();
		EmpInfo empInfo = (EmpInfo) applicationContext.getBean("employee1");
		log.info("Emplooyee salary : " + empInfo.getSalary());
		log.info("Employee name : " + empInfo.getName());
		log.info("Employee dept  name : " + empInfo.getDepartmentBean().getDeptId());
		log.info("Employee dept  name : " + empInfo.getDepartmentBean().getDeptName());
		
		
		

	}

}

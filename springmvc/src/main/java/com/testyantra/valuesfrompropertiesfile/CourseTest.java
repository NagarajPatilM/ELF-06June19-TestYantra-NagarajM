package com.testyantra.valuesfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;
@Log
public class CourseTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		CourseBean bean = (CourseBean) context.getBean("course");
		log.info(""+bean.getName());
		log.info(""+bean.getStaff());
	}

}

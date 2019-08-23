package com.testyantra.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;
@Log
public class MessageBeanTest {
	
	public static void main(String[] args) {
		//ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		MessageBean bean1=(MessageBean) context.getBean("bean");
		
		/*
		 * MessageBean messageBean1= context.getBean(MessageBean.class);
		 * messageBean1.setMessage("nag");
		 * 
		 * MessageBean messageBean2= context.getBean(MessageBean.class);
		 * messageBean2.setMessage("raj");
		 */
		/*
		 * log.info(" "+messageBean1.getMessage());
		 * log.info(" "+messageBean2.getMessage());
		 */

	   log.info(" "+bean1.getMessage());
	  // log.info(" "+bean2.getMessage());
	    
	}
	
}

package com.testyantra.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.java.Log;
@Log
public class MessageBeanTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		
	   MessageBean messageBean1= context.getBean(MessageBean.class);
	   messageBean1.setMessage("nag");
	   
	   MessageBean messageBean2= context.getBean(MessageBean.class);
	   messageBean2.setMessage("raj");
	   
	   log.info(" "+messageBean1.getMessage());
	   log.info(" "+messageBean2.getMessage());
	    
	}
	
}

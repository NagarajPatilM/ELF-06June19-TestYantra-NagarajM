package com.testyantra.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testyantra.beans.MessageBean;

import lombok.extern.java.Log;

@Log
public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		MessageBean messageBean = (MessageBean) applicationContext.getBean("bean");
		log.info(messageBean.getMessage());
	}

}

package com.testyantra.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;
import lombok.extern.java.Log;

@Data @Log
public class MessageBean  {  //implements InitializingBean,DisposableBean 
	
	String message;
	
	@PostConstruct            //3rd method for initializing 
	public void init() {        // using annotations
		log.info("init phase");
	}
	
	@PreDestroy
	public void destroy() {
		log.info("destroy phase");
	}

	
	
//	@Override
//	public void afterPropertiesSet() throws Exception {  // 1st method for initializing 
//		log.info("initialization phase");
//	}
//
//	@Override
//	public void destroy() throws Exception {   //1st method for destroy 
//		log.info("destroy phase");
//	
//	}
	
	
	
}

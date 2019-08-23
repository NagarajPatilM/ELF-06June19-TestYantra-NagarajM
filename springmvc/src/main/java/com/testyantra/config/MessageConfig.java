   /* This class 
       is used 
       instead of .xml file*/

package com.testyantra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MessageConfig {

	@Bean @Scope("prototype")
	public MessageBean getMessageBean() {
		return new MessageBean();
	}

}

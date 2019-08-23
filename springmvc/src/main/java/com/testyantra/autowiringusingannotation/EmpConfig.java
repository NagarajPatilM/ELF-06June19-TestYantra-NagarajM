package com.testyantra.autowiringusingannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DeptConfig.class)
public class EmpConfig {

	@Bean
	public EmpInfoBean getEmpInfo() {
		EmpInfoBean empInfo = new EmpInfoBean();
		empInfo.setName("sehwag");
		empInfo.setSalary(20000);
		return empInfo;
	}


}

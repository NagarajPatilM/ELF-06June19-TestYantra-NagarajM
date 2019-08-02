package com.testyantra.hibernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.testyantra.hibernateapp.onetoone.EmployeeInfoBean;
import com.testyantra.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {
	private PrepareDataUtil() {

	}

	public static EmployeeInfoBean prepareData(int id) throws ParseException {
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		EmployeeOtherInfoBean empOtherInfo = new EmployeeOtherInfoBean();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse("2018-02-07");

		empInfo.setId(id);
		empInfo.setAccountNo(13256276);
		empInfo.setHiredate(date);
		empInfo.setAge(23);
		empInfo.setDeptId(50);
		empInfo.setDesignation("developer");
		empInfo.setDob(date);
		empInfo.setEmail("chahal@34");
		empInfo.setGender("male");
		empInfo.setMngrId(3);
		empInfo.setName("chahal");
		empInfo.setPhoneNo(936782382);
		empInfo.setSalary(60000);
		
		empOtherInfo.setId(id);
		empOtherInfo.setAadhaar(1252627);
		empOtherInfo.setBloodGrp("a positive");
		empOtherInfo.setEmergencContactNo(25623778);
		empOtherInfo.setEmergencyContactName("avf");
		empOtherInfo.setFatherNm("sgfg");
		//empOtherInfo.setId(8);              //be carefull here
		empOtherInfo.setIsChallenged(false);
		empOtherInfo.setIsmarried(true);
		empOtherInfo.setMotherNm("ghsj");
		empOtherInfo.setNationality("German");
		empOtherInfo.setPan("gs67hnhjs8");
		empOtherInfo.setPassport("ghs7889");
		empOtherInfo.setReligion("hindu");

		empInfo.setOtherInfo(empOtherInfo);
		return empInfo;

	}

}

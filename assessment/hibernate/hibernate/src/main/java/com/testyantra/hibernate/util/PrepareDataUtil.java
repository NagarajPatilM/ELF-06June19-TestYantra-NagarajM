package com.testyantra.hibernate.util;

import com.testyantra.hibernate.dto.StudentsInfoBean;
import com.testyantra.hibernate.dto.StudentsOtherInfoBean;

public class PrepareDataUtil {

	private static StudentsInfoBean infoBean=new StudentsInfoBean();
	private static StudentsOtherInfoBean otherInfoBean=new StudentsOtherInfoBean();

	public static StudentsInfoBean prepareData(int rollNo) {
		infoBean.setRollNo(rollNo);
		infoBean.setAge(23);
		infoBean.setEmailId("nag@33");
		infoBean.setGender("male");
		infoBean.setName("nag");
		infoBean.setMobileNo(1223456);

		otherInfoBean.setRollNum(rollNo);
		otherInfoBean.setFatherName("mallikarjuna");
		otherInfoBean.setMotherName("nirmala");
		otherInfoBean.setNationality("indian");
		otherInfoBean.setReligion("hindu");

		infoBean.setStudentOtherInfo(otherInfoBean);

		return infoBean;

	}

}

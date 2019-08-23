package com.testyantra.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.testyantra.hibernate.manytoone.EducationInfoPKBean;
import com.testyantra.hibernate.manytoone.EmployeeAddressInfoBean;
import com.testyantra.hibernate.manytoone.EmployeeAddressPKBean;
import com.testyantra.hibernate.manytoone.EmployeeEducationInfoBean;
import com.testyantra.hibernate.manytoone.EmployeeExperienceInfoBean;
import com.testyantra.hibernate.manytoone.EmployeeExperiencePKBean;
import com.testyantra.hibernateapp.model.HibernaetImpl;
import com.testyantra.hibernateapp.onetoone.EmployeeInfoBean;
import com.testyantra.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class App {
	
	public static void main(String[] args) throws ParseException {
		EmployeeInfoBean infoBean = new EmployeeInfoBean();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse("2018-02-07");

		infoBean.setId(6);
		infoBean.setName("abc");
		infoBean.setAccountNo(12345676);
		infoBean.setAge(23);
		infoBean.setDeptId(10);
		infoBean.setDesignation("software Engineer");
		infoBean.setDob(date);
		infoBean.setEmail("abc@13");
		infoBean.setGender("male");
		infoBean.setHiredate(date);
		infoBean.setMngrId(101);
		infoBean.setPhoneNo(12345);
		infoBean.setSalary(20000);

		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setInfoBean(infoBean);
		otherInfoBean.setAadhaar(132378);
		otherInfoBean.setBloodGrp("a positive");
		otherInfoBean.setEmergencContactNo(7376789);
		otherInfoBean.setFatherNm("manu");
		otherInfoBean.setIsChallenged(false);
		otherInfoBean.setIsmarried(true);
		otherInfoBean.setMotherNm("mother");
		otherInfoBean.setNationality("indian");
		otherInfoBean.setPan("bdsgh2356");
		otherInfoBean.setPassport("sf357");
		otherInfoBean.setReligion("Hindu");
		otherInfoBean.setSpouseNm("xyz");
		
		EmployeeAddressPKBean addressPKBean1=new EmployeeAddressPKBean();
		addressPKBean1.setAddressType("T");
		addressPKBean1.setInfoBean(infoBean);

		EmployeeAddressPKBean addressPKBean2=new EmployeeAddressPKBean();
		addressPKBean2.setAddressType("P");
		addressPKBean2.setInfoBean(infoBean);

		//otherInfoBean.setInfoBean(infoBean);
		EmployeeAddressInfoBean addressInfoBean1=new EmployeeAddressInfoBean();
		addressInfoBean1.setAddtessPK(addressPKBean1);
		addressInfoBean1.setAddress1("near");
		addressInfoBean1.setAddress2("beside");
		addressInfoBean1.setCity("bang");
		addressInfoBean1.setCountry("india");
		addressInfoBean1.setDistrict("koppal");
		addressInfoBean1.setLandmark("school");
		addressInfoBean1.setPincode("583233");
		addressInfoBean1.setState("karnataka");
		
		
		EmployeeAddressInfoBean addressInfoBean2=new EmployeeAddressInfoBean();
		addressInfoBean2.setAddress1("near");
		addressInfoBean2.setAddress2("beside");
		addressInfoBean2.setAddtessPK(addressPKBean2);
		addressInfoBean2.setCity("hospet");
		addressInfoBean2.setCountry("india");
		addressInfoBean2.setDistrict("bellary");
		addressInfoBean2.setLandmark("moti");
		addressInfoBean2.setPincode("357");
		addressInfoBean2.setState("karnataka");
		
		EducationInfoPKBean educationInfoPKBean1=new EducationInfoPKBean();
		educationInfoPKBean1.setEducation_type("online");
		educationInfoPKBean1.setInfoBean(infoBean);
		
		EducationInfoPKBean educationInfoPKBean2=new EducationInfoPKBean();
		educationInfoPKBean2.setEducation_type("class");
		educationInfoPKBean2.setInfoBean(infoBean);
		
		EmployeeEducationInfoBean educationInfoBean1=new EmployeeEducationInfoBean();
		educationInfoBean1.setEducationInfoPK(educationInfoPKBean1);
		educationInfoBean1.setBranch("basvangudi");
		educationInfoBean1.setCollegeName("BITM");
		educationInfoBean1.setDegreeType("BE");
		educationInfoBean1.setLocation("ballari");
		educationInfoBean1.setPercentage("56");
		educationInfoBean1.setUniversity("VTU");
		educationInfoBean1.setYop(2018);
		
		EmployeeEducationInfoBean educationInfoBean2=new EmployeeEducationInfoBean();
		educationInfoBean2.setEducationInfoPK(educationInfoPKBean2);
		educationInfoBean2.setBranch("lalbagh");
		educationInfoBean2.setCollegeName("BITM");
		educationInfoBean2.setDegreeType("BE");
		educationInfoBean2.setLocation("ballari");
		educationInfoBean2.setPercentage("56");
		educationInfoBean2.setUniversity("VTU");
		educationInfoBean2.setYop(2018);
		
		EmployeeExperiencePKBean experiencePKBean1=new EmployeeExperiencePKBean();
		experiencePKBean1.setCompanyName("cansellalabs");
		experiencePKBean1.setInfoBean(infoBean);
		
		EmployeeExperiencePKBean experiencePKBean2=new EmployeeExperiencePKBean();
		experiencePKBean2.setCompanyName("unisys");
		experiencePKBean2.setInfoBean(infoBean);
		
		EmployeeExperienceInfoBean experienceInfoBean1=new EmployeeExperienceInfoBean();
		experienceInfoBean1.setEmployeeExperiencePKBean(experiencePKBean1);
		experienceInfoBean1.setDesignation("engineer");
		experienceInfoBean1.setLeavingDate(date);
		experienceInfoBean1.setJoiningDate(date);
		
		EmployeeExperienceInfoBean experienceInfoBean2=new EmployeeExperienceInfoBean();
		experienceInfoBean2.setEmployeeExperiencePKBean(experiencePKBean2);
		experienceInfoBean2.setDesignation("test engineer");
		experienceInfoBean2.setLeavingDate(date);
		experienceInfoBean2.setJoiningDate(date);
		
		
		
		HibernaetImpl impl = new HibernaetImpl();
		impl.createEmployee(infoBean, otherInfoBean, Arrays.asList(addressInfoBean1,addressInfoBean2),
				Arrays.asList(educationInfoBean1,educationInfoBean2),Arrays.asList(experienceInfoBean1,experienceInfoBean2));
		
	}// End of main
} // End Of Class

package com.testyantra.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class StudentArrayList {

	public static void main(String[] args) {
              ArrayList<Student> a=new ArrayList<>();
              a.add(new Student("nag",3,56.2));
              a.add(new Student("raj",4,92.8));
              a.add(new Student("shweta",5,56.2));
              a.add(new Student("patil",6,60.0));
              
              for(int i=0;i<a.size();i++) {
            	 Student st= a.get(i);
            	 log.info("name is "+st.name);
            	 log.info("id is "+st.id);
            	 log.info("percentage is "+st.percentage);
            	 log.info("=====================");
            	 
              }
              

	}

}

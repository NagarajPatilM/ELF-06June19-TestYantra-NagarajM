package com.testyantra.jvaapp.beanclass;

public class TestEmployee {

	public static void main(String[] args) {
   DB d=new DB();
   Employee e=new Employee();
   e.setEid(24);
   e.setName("nagaraj");
   d.receive(e);
	}

}

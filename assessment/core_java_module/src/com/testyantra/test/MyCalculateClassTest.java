package javaassesment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.testyantra.javaapp.assessment.MyCalculateClass;

public class MyCalculateClassTest {
	
	private MyCalculateClass m=new MyCalculateClass();

	@Test
	public void toCalFactTest() {
		int actual=120;
		int received=m.toCalFact(5);
		assertEquals(actual, received);
	}

	public void toCalculateSITest() {
		int actual=100;
		double received=m.toCalculateSI(1000, 2.0, 5.0);
		assertEquals(actual, received,0.01);
	}
}

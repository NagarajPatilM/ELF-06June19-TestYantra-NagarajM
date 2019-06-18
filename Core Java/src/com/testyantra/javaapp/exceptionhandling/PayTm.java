package com.testyantra.javaapp.exceptionhandling;

public class PayTm {
	IRCTC i = new IRCTC();

	void book(int amount,Travels t,String n) {
		try {
			if (amount >= 200) {
				System.out.println("proceeded for booking by paytm");
				i.status(n);
			} else {
				if(t instanceof VRL)
				{
					System.out.println("VRL bus is not available");
				}
				else if(t instanceof Ganesh)
				{
					System.out.println("ganesh travels is not available");
				}
				System.out.println(10 / 0);
			}

		} catch (ArithmeticException e) {
			System.out.println("invalid amount");
			throw e;
		}
	}
}
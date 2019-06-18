package com.testyantra.javaapp.logging;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingDemo {
	private static final Logger loger = Logger.getLogger("virat");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		/*
		 * ConsoleHandler ch = new ConsoleHandler(); ch.setLevel(Level.CONFIG);
		 * loger.addHandler(ch);
		 */
		try {
			FileHandler fh=new FileHandler("flipkart.log");
			fh.setLevel(Level.INFO);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			
			loger.log(Level.SEVERE, "severe message");
			loger.log(Level.WARNING, "BYE");
			loger.log(Level.INFO, "hi");
			loger.log(Level.CONFIG, "config message");
			loger.log(Level.FINE, "hi");
			loger.log(Level.FINER, "hi");
			loger.log(Level.FINEST, "hi");
			
			BuyProduct by=new BuyProduct();
			by.buy();
			System.out.println("done");

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}

}

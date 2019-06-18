package com.testyantra.javaapp.logging;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger loger = Logger.getLogger("virat");

void buy()
{
	loger.log(Level.SEVERE, "buy message");
	loger.log(Level.WARNING, "BYE");
	loger.log(Level.INFO, "hi");
	loger.log(Level.CONFIG, "config message");
	loger.log(Level.FINE, "hi");
	loger.log(Level.FINER, "hi");
	loger.log(Level.FINEST, "hi");
	
}
}

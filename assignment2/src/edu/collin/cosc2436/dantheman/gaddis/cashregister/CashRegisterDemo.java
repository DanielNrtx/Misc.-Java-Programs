package edu.collin.cosc2436.dantheman.gaddis.cashregister;

/**
 * This is a demo program to test the CashRegister calculator
 * 
 * @DanielNelson 
 *
 */

public class CashRegisterDemo {
	public static void main(String[] args) {
		double[] prices = {2.49, 3.25, 1.79, 2.99};
		CashRegister.setRetailItemLookup(new RetailItemLookup(3, prices));
		RetailItem chips = RetailItem.CHIPS;
		RetailItem cereal = RetailItem.CEREAL;
		RetailItem soap = RetailItem.SOAP;
		RetailItem soda = RetailItem.SODA;
		
		CashRegister register = new CashRegister();
		register.startTransaction();
		register.scanItem(chips);
		register.scanItem(cereal);
		register.printReceipt();
		
		register.startTransaction();
		register.scanItem(soap);
		register.scanItem(soda);
		register.printReceipt();
		
		register.startTransaction();
		register.scanItem(chips);
		register.scanItem(cereal);
		register.scanItem(soap);
		register.scanItem(soda);
		register.printReceipt();	
	}
}
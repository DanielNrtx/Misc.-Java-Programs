package edu.collin.cosc2436.dantheman.gaddis.cashregister;

import java.util.ArrayList;


/**
 * This class implements a cash register calculator for all purchases within a
 * revenue cycle
 * 
 * @DanielNelson
 *
 */

public class CashRegister {
	private static RetailItemLookup retailItem;
	private ArrayList<RetailItem> retailItems;
	
	/**
	 * Sets the Retail Item Lookup for all instances of the class
	 * 
	 * @param RetailItemLookup 
	 */
	
	public static void setRetailItemLookup(RetailItemLookup retailItemLookup) {
		CashRegister.retailItem = retailItemLookup;
	}
	
	/**
	 * Resets receipt and new purchases
	 */
	
	public void startTransaction() {
		retailItems = new ArrayList<>();
	}
	
	public void scanItem(RetailItem retailItem) {
		retailItems.add(retailItem);
	}
	
	/**
	 * Calculates the subtotal for all purchases before taxes

	 * @return The subtotal before taxes
	 */
	
	private double calculateSubtotal() {
		double subtotal = 0;
		for(RetailItem item : retailItems) {
			subtotal += retailItem.getPrice(item);
		}
		return subtotal;
	}
	
	/**
	 * Calculates the total tax for all purchases
	 * 
	 * @return The total tax
	 */
	
	private double calculateTax() {
		double tax = 0;
		for (RetailItem item : retailItems) {
			tax += retailItem.taxTime(item);
		}
		return tax;
	}
	
	/**
	 * Prints the breakdown of the revenue cycle
	 */
	
	public void printReceipt() {
		for(RetailItem item : retailItems) {
			System.out.printf(item + "\t\t$ ");
			System.out.printf("%5.2f\n", retailItem.getPrice(item));
		}
		double subtotal = calculateSubtotal();
		double tax = calculateTax();
		System.out.printf("\nSubtotal\t$ ");
		System.out.printf("%5.2f", subtotal);
		System.out.printf("\nTax\t\t$ %5.2f", tax);
		System.out.printf("\nTotal\t\t$ %5.2f", (subtotal+tax));
		System.out.printf("\n----------------\n");
	}
	
}

package edu.collin.cosc2436.dantheman.gaddis.cashregister;

/**
 * The Retail Item Lookup class that provides item rates and taxes
 * 
 * @DanielNelson
 *
 */

public class RetailItemLookup {
	private final double taxRate;
	private final double[] prices;
	
	/**
	 * Constructs a price for specified items and applicable taxes
	 * 
	 * @param taxRae A tax rate applied to items
	 * @param price        An array of item prices
	 */
	
	public RetailItemLookup(double taxRate, double[] price) {
		this.taxRate = taxRate/100;
		this.prices = new double[price.length];
		for (int i = 0; i < price.length; i++) {
			this.prices[i] = price[i];
		}
	}
	
	/**
	 * Provides the price for a specified item purchase
	 * 
	 * @param RetailItem The item for purchase
	 * @return The price per item
	 */
	
	public double getPrice(RetailItem item) {
		return prices[item.ordinal()];
	}
	
	/**
	 * Provides the tax for a specified items
	 * 
	 * @param RetailItem 
	 * @return The tax per item
	 */
	
	public double taxTime(RetailItem item) {
		switch(item) {
		case CHIPS:
		case CEREAL:
		case SOAP:
		case SODA:
			return getPrice(item)*taxRate;
		default:
			return 0;
		}
	}
}

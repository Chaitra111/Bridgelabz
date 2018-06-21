package com.bridgelabz.companydata;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 */
public class CompanyShares {

	private String symbol;
	private int numberOfShares;
	private double price;
	private String dateTime;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getValue() {
		return numberOfShares * price;
	}

	public String toString() {
		return "\nShare Details: \n" + symbol + ", " + numberOfShares + ", " + price;
	}
}
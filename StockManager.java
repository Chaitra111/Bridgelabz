package com.bridgelabz.companydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 */
public class StockManager {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		StockManager companyManager = new StockManager();
		companyManager.askUser();
	}

	public void askUser() throws FileNotFoundException, IOException, ParseException {
		StockData stockData = new StockData();
		System.out.println("\n Enter your name:");
		String name =Utility.getString();
		System.out.println("Enter the file name");
		String filename = Utility.getString();
		String path = "/home/bridgeit/Documents/program_chaitra/bridgelabz/src/com/bridgelabz/companydata/"
				+ filename;
		stockData.createNewFile(path);

		System.out.println("what do you want to perform?");
		System.out.println("1.Buy stock??");
		System.out.println("2.Sell stock??");
		System.out.println("3.Quit");
		int choice =Utility.getInteger();

		String filePath = "/home/bridgeit/Documents/Docs/StockAccount.json";
		switch (choice) {
		case 1:
			stockData.printEntries(filePath);
			System.out.println("Which symbol do you want to buy?");
			String symbol = Utility.getString();
			System.out.println("How much amount you have?");
			int amount = Utility.getInteger();
			stockData.buy(amount, symbol, filePath, path);
			askUser();
			break;
		case 2:

			stockData.sell(filePath, path);
			askUser();
			break;
		default:
			break;
		}
	}
}
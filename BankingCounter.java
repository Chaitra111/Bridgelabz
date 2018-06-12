package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Utility;

public class BankingCounter {
	static QueueLogic q = new QueueLogic(5);
	static double AMOUNT = 0;

	public static void main(String[] args) {
		int choice = 0;

		System.out.println("Enter minimum balance to be maintained");
		AMOUNT = Utility.getInteger();
		System.out.println("Amount in bank  :" + AMOUNT);
		double totalAmount = AMOUNT;
		for (int i = 0; i < q.size(); i++) {
			q.enqueue(i);
		}
		for (int i = 0; i < q.size(); i++) {
			System.out.println("Enter the following option");
			System.out.println("enter 1 for deposit");
			System.out.println("enter 2 for withdraw");
			System.out.println("enter 3 for people in the Queue ");
			choice = Utility.getInteger();

			double cash = 0;
			switch (choice) {
			case 1:
				System.out.println("enter the amount to be deposit");
				cash = Utility.getInteger();
				totalAmount = deposit(cash, totalAmount);
				System.out.println(totalAmount);
				break;
			case 2:
				System.out.println("enter the amount to be withdraw");
				cash = Utility.getInteger();
				totalAmount = withdraw(cash, totalAmount);
				System.out.println(totalAmount);
				break;
			case 3:
				int j=q.size();
				System.out.println("The Number of People in Queue is: "+j); 
				break;
			}
		}
	}

	public static double deposit(double cash, double amount) {
		amount = amount + cash;
		q.dequeue();
		System.out.println(amount);
		return amount;
	}

	public static double withdraw(double cash2, Double amount) {
		if (cash2 < amount) {
			amount = amount - cash2;
			q.dequeue();
			return amount;
		}
		return amount;
	}
}
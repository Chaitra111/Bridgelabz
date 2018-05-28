package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Utility;

public class BankingCounter 
{
	public static void main(String[] args)
	{
	Utility u=new Utility();
	QueueLogic ql=new QueueLogic(8);
	int i=0;
	do
	{
		
		System.out.println("***************Banking Cash Counter***************");
		System.out.println("1: Deposit");
		System.out.println("2: Withdraw");
		System.out.println("3: Display number of people in the queue");
		System.out.println("Enter the choice:");
		int ch=u.getInteger();
		switch(ch)
		{
			case 1:
					System.out.println("Enter the amount you want to deposit:");
					ql.enqueue(u.getInteger());
					ql.display();
					break;
			
			case 2:
					System.out.println("Enter the amount you want to withdraw:");
					u.getInteger();
					ql.dqueue();
					ql.display();
					System.out.println("Your balance is :");
					
					break;
					
			case 3:
				    int n=ql.qsize();
					System.out.println("Number of people in the queue:" +n);
					break;
			
			default:
					System.out.println("Wrong choice");
					break;
		}
	}while(i<4);		
}
}

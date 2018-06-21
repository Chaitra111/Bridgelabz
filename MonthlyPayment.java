package com.bridgelabz.AlgorithmPrograms;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : To calculate monthlypayment
 */
public class MonthlyPayment 
{
	public static void monthPayment(double pLoan, double perInterest, int year)
	{
		int n=12*year;
		double r=(perInterest/(12*100));
		double res=Math.pow((1+r),-n);
		double payment=((perInterest*r)/(1-res));
		System.out.println("Monthly payment:" +payment);
		
	}

	public static void main(String[] args) 
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		monthPayment(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Integer.parseInt(args[2]));
	}

}

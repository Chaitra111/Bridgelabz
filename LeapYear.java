package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Enter 4 digit number and display whether it is leap year or  not
 */
public class LeapYear
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		int number=utility.getInteger();
		int digits =Utility.noOfDigits(number);
		System.out.println("No of digits: " +digits);
		Utility.leapyear(number, digits);
	}
}
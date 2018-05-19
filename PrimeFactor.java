package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : To find the Prime factors of number
 */
public class PrimeFactor 
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();		
		int number=utility.getInteger();		
		utility.toFindPrime(number);
	}
}
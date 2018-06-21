package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;
 /**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Temperature conversion
 */
public class TempConvert
{

	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter temperature in celcius:");
		double celcius=u.getInteger();
		System.out.println("Enter temperature in fahrenhit:");
		double fahrenhit=u.getInteger();
		u.tempConvert(celcius,fahrenhit);
	}

}

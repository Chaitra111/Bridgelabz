package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : To print table of the powers of 2 that are less than or equal to 2^N
 */
public class PowerOfTwo {

	public static void main(String[] args)
	{
		Utility utility = new Utility();
		for(int i=0; i<args.length; i++)
		{
		System.out.println(args[i]);
		int pwr=Integer.parseInt(args[i]);
		utility.findPower(pwr);
		}
		}
	}
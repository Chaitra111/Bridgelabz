package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

 /**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Print the Nth harmonic number
 */
public class Harmonic
{	
		public static void main(String[] args)
		{
			Utility utility = new Utility();
			int integer = utility.getInteger();
			float res=Utility.harmonicvalue(integer);
			System.out.println(res);
		}
}
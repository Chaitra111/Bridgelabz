package com.bridgelabz.FunctioalPrograming;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :
 */
public class WindChill 
{
	//Check temperature
	public static void checkTemp(int x,int y)
	{
		if(x<=50 && y<=120 && y>3)
		{
		double w = 35.74 +0.6215 * x+(0.4275 * x- 35.75)*Math.pow(y,0.16);
		System.out.println(w);
		}
	}

	public static void main(String[] args)
	{
		for(int i=0; i<args.length; i++)
		{
		System.out.println(args[i]);
		}
	      	checkTemp(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}

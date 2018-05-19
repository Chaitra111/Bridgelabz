package com.bridgelabz.FunctioalPrograming;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Calculate Euclidean distance
 */
public class Distance
{
	public static void calculateDistance(double xValue,double yValue)
	{		
	 	double distance=Math.sqrt((Math.pow(xValue,2)+Math.pow(yValue,2)));
		System.out.println("Euclidean distance:" +distance);
	}

	public static void main(String[] args)
	{
		for(int i=0; i<args.length; i++)
		{
		System.out.println(args[i]);
		}
		calculateDistance(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}
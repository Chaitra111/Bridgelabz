package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;

public class Sqrt
{
	public static void sqrt(double c)
	{
		double t=c;	
		double epsilon=1e-15;
		if(Math.abs(t-c/t)>epsilon*t);
		{
			t=(c/t+t)/2.0;			
		}
		System.out.println(t);
	}
	
	public static void main(String[] args)
	{
		Utility u= new Utility();
		double c=u.getDouble();
		sqrt(c);
		

	}

}

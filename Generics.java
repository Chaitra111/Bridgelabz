package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;

public class Generics 
{
	public static int maximum(int n1, int n2,int n3)
	{
		if(n1>n2 && n1>n3)
		{
			return n1;
		}
		else if(n2>n3 && n2>n1)
		{
			return n2;
		}
		else
		{
		return n3;
		}
	}
	public static <T extends Comparable> T max(T number1, T number2,T number3)
	{
		if(number1.compareTo(number2)>0 && number1.compareTo(number3)>0)
		{
			return number1;
		}
		else if(number2.compareTo(number3)>0 && number2.compareTo(number1)>0)
		{
			return number2;
		}
		else
		{
		return number3;
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		Utility u = new Utility();
		int number1=u.getInteger();
		int number2=u.getInteger();
		int number3=u.getInteger();		
		int result=maximum(number1,number2,number3);
		System.out.println("Max value:" +result);		
		String n1=u.getString();
		String n2=u.getString();
		String n3=u.getString();
		String res=max(n1,n2,n3);
		System.out.println("Max value:" +res);
}
}

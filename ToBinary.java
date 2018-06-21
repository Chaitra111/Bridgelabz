package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : To convert decimal to binary
 */
public class ToBinary 
{
	public static String decTobin(int num)
	{
		String out="";
		int rem;
		while(num!=0)
		{
			rem = num%2;
			out=rem+out;
			num/=2;
		}
		return out;
	}
	public static void main(String[] args)
	{
		Utility u= new Utility();
		int num=u.getInteger();
		String res=decTobin(num);
		System.out.println(res);
	}

}

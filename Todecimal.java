package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Convert decimal numbber to bianary number of 8 bits and swap the nibbles and fid new number and then convert into decimal
 */
public class Todecimal
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
		while(out.length()<8)
		{
			out="0"+out;
		}
		return out;
	}
	public static String swap(String res)
	{
		String str1=res.substring(0, res.length()/2);
		String str2=res.substring(res.length()/2);
		String out=str2+str1;
		return out;
	}
	public static int bin2dec(String out)
	{
		int num=Integer.parseInt(out);
		int c=0;
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			int result= (int) Math.pow(2,c++);
			res=res+result*rem;
			num/=10;
		}
		return res;
	}
	public static void main(String[] args)
	{
		Utility u= new Utility();
		int num=u.getInteger();
		String res=decTobin(num);
		System.out.println(res);
		String out=swap(res);
		System.out.println(out);
		int result=bin2dec(out);
		System.out.println(result);
	}

}

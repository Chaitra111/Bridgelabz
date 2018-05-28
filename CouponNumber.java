package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : To generate distinct coupon number
 */
public class CouponNumber
{
	public static void main(String[] args) 
	{
		Utility u=new Utility(); 
		int num=u.getInteger();
		int c=0;
		int n=0;
		String string=u.getString();
		char[] ch=string.toCharArray();
		StringBuffer buffer=new StringBuffer();
		while(n<num)
		{
		int maxValue=1000;
		int value=(int) (Math.random()*maxValue);	
		
		while (value>0)
		{
			buffer.append(ch[value % ch.length]);
			value /= ch.length;
			c++;
		}
		n++;
		}
		String couponCode=buffer.toString();
		System.out.println("Distinct coupon Code is"  +" " +couponCode+ " " );
	}
}


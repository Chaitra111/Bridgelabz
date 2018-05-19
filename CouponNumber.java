package com.bridgelabz.FunctioalPrograming;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : To generate distinct coupon number
 */
public class CouponNumber
{
	public static void main(String[] args) 
	{
		String string="abndghjklpoiuuyyttrew456787890";
		char[] ch=string.toCharArray();
		int maxValue=1000;
		int randomValue=(int) (Math.random()*maxValue);	
		StringBuffer buffer=new StringBuffer();
		
		while (randomValue>0)
		{
			buffer.append(ch[randomValue % ch.length]);
			randomValue /= ch.length;
		}

		String couponCode=buffer.toString();
		System.out.println("Coupon Code is : "+couponCode);	
	}
}


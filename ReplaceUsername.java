package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * 
 * Date:18/05/2018
 * 
 * Purpose:Get the Input and Replace String Template “Hello <<UserName>>, How are you?”  
 */
public class ReplaceUsername 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		String name=utility.getString();
		String msg = "Hello <<username>>, How are you?";
		if(name.length()>=3) 
		{
		    System.out.println(msg.replace("<<username>>",name));
		}
		else
		{
			System.out.println("Invalid input required minimum three character........");
		} 
		} 
	}





















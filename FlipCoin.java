package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Flip Coin and print percentage of Heads and Tails
 */
public class FlipCoin 
{
	static int heads=0;
	static int tails=0;
    public static void flip1(int noofflip)
    {
    		for (int i=0; i< noofflip; i++) 
			{
    		System.out.println(Math.random());
	        if(Math.random()>0.5)
	        {
	            heads++;
	            System.out.println(heads);
	        }
	        else
	        {
	        	tails++;
	        	System.out.println(tails);
	        }
			}
	        System.out.println("percentage of heads= "+(heads*100)/noofflip);
	        System.out.println("percentage of tails= "+(tails*100)/noofflip);
	        
	       
	    }
	public static void main(String args[])
	{
	    Utility u=new Utility();
	    int flip=u.getInteger();
	    flip1(flip);
	    
	    
	}
	}



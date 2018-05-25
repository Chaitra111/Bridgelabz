package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :  Simulates a gambler
 */
public class Gambler 
	{
		public static void main(String[] args) 
		{	
			Utility u=new Utility();
			System.out.println("Enter stake value: ");
			int stake=u.getInteger();
			System.out.println("Enter goal value: ");
			int goal=u.getInteger();
			System.out.println("Enter number of times: ");
			int nooftimes=u.getInteger();
			int bets = 0;        
			int win = 0;        
			for (int i=0; i< nooftimes; i++) 
			{
				int cash = stake;
		        while (cash > 0 && cash < goal)
				{
					bets++;
		        
					if (Math.random() < 0.5) 
						cash++;    
					else                     
						cash--;     
				}
		            if (cash == goal) 
		            {
		            	win++; 
		            }
		            System.out.println(win + " wins of " + nooftimes);
		    		System.out.println("Percent of games won = " + 100.0 * win / nooftimes);
		    		System.out.println("Avg bets = " + 1.0 * bets / nooftimes);
		    	}
		    }
	}

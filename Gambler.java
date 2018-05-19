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
			System.out.println("Enter $Stake value: ");
			int $Stake=u.getInteger();
			System.out.println("Enter $Goal value: ");
			int $Goal=u.getInteger();
			System.out.println("Enter number of times: ");
			int noOftimes=u.getInteger();
			int bets = 0;        
			int wins = 0;        
			for (int i=0; i< noOftimes; i++) 
			{
				int cash = $Stake;
		        while (cash > 0 && cash < $Goal)
				{
					bets++;
		        
					if (Math.random() < 0.5) 
						cash++;    
					else                     
						cash--;     
				}
		            if (cash == $Goal) 
		            {
		            	wins++; 
		            }
		            System.out.println(wins + " wins of " + noOftimes);
		    		System.out.println("Percent of games won = " + 100.0 * wins / noOftimes);
		    		System.out.println("Avg bets = " + 1.0 * bets / noOftimes);
		    	}
		    }
	}

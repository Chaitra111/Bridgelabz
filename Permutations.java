package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Permutation of a String
 */
public class Permutations 
{
	private static void permutations(char[] ch, int currentIndex)
    {
		
        if (currentIndex == ch.length - 1) 
        {
            System.out.println(String.valueOf(ch));
        }

        for (int i = currentIndex; i < ch.length; i++)
        {
            Utility.swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            Utility.swap(ch, currentIndex, i);
        }
    }
    // generate all permutations of a String in Java
    public static void main(String[] args)
    {    	
    	Utility u = new  Utility();
    	String string=u.getString();
        permutations(string.toCharArray(), 0);
     }
    
}
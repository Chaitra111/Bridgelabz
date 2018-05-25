package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Permutation of a String
 */
public class Permutations 
{
	private static void permutations(char[] chars, int index)
    {		
        if (index==chars.length - 1) 
        {
            System.out.println(String.valueOf(chars));
        }
        for (int i = index; i < chars.length; i++)
        {
            Utility.swap(chars, index, i);
            permutations(chars, index + 1);
            Utility.swap(chars, index, i);
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
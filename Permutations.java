package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Permutation of a String
 */
public class Permutations 
{
	public static void main(String[] args)
    {
		Utility u = new  Utility();
    	String str=u.getString();
        int n = str.length();
        Permutations permutation = new Permutations();
        permutation.permutation(str, 0, n-1);
    }
	 private void permutation(String str, int start, int end)
	    {
		if (start == end)
			System.out.println(str);
		else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permutation(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
	}
	 public String swap(String string, int i, int j)
	    {
	        char temp;
	        char[] charArray = string.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }	 
	}
	
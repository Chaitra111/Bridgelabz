package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Merge sort
 */
public class MergeSort
{
		public static void main(String[] args) {
			Utility u=new Utility();
			System.out.println("enter the length of String elemnt");
		    int length=u.getInteger();
		    
		    System.out.println("Enter the string elements of 1st array:");
		    String[] low = new String[length];
		   
		    for(int i=0;i<length;i++) 
		    {
		    low[i]=u.getString();
		    }
		    
		    System.out.println("Enter the string elements 2nd array:");
		    String[] high = new String[length];
		   
		    for(int i=0;i<length;i++) 
		    {
		    high[i]=u.getString();
		    }
		    String[] array = new String[low.length + high.length];
		       
		      u. merge(array, low, high);

		     u.mergeSort(array);
		        
		       for (String s : array)
		          {
		            System.out.println(s+" ");
		          }
		     }

		 }
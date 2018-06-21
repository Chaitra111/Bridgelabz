package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Binary search
 */
public class BinarySearch 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		//Searching integer
		Utility u=new Utility();
		System.out.println("Enter the size of the array:");
		int size=u.getInteger();
		System.out.println("Enter the key :");
		int key=u.getInteger();
		System.out.println("Enter the start value:");
		int start=u.getInteger();
		System.out.println("Enter the end value :");
		int end=u.getInteger();
		int[] array = new int[size];
		for(int i=0; i<size;i++)
		{
			System.out.println("Enter the array element :");
			array[i]=u.getInteger();
		}
		u.binarySearch(array,start,end,key);
		
	
	 
	  //Searching string
		System.out.println("Enter the size of the array:");
		int size1=u.getInteger();
		System.out.println("Enter the key :");
		String key1=Utility.getString();
		System.out.println("Enter the start value:");
		Integer start1=u.getInteger();
		System.out.println("Enter the end value :");
		int end1=u.getInteger();
		String string[]=new String[size1];
		for(int j=0; j<size1;j++)
		{
			System.out.println("Enter the string element :");
			string[j]=Utility.getString();
			
		}
		u.binarySearchString(string, key1,start1,end1);
		
		
		System.out.println("Enter the size of the array:");
		int size2=u.getInteger();
		System.out.println("Enter the key :");
		int key2=u.getInteger();
		System.out.println("Enter the start value:");
		int start2=u.getInteger();
		System.out.println("Enter the end value :");
		Integer end2=u.getInteger();
		Integer[] array1 = new Integer[size2];
		for(int i=0; i<size2;i++)
		{
			System.out.println("Enter the array element :");
			array1[i]=u.getInteger();
		}
		u.binarySearchG(array1,start2,end2,key2);
		
	
	 
	  //Searching string
		System.out.println("Enter the size of the array:");
		int size3=u.getInteger();
		System.out.println("Enter the key :");
		String key3=u.getString();
		System.out.println("Enter the start value:");
		Integer start3=u.getInteger();
		System.out.println("Enter the end value :");
		int end3=u.getInteger();
		String string1[]=new String[size3];
		for(int j=0; j<size3;j++)
		{
			System.out.println("Enter the string element :");
			string1[j]=u.getString();
			
		}
		u.binarySearchG(string1,start3,end3,key3);			
	}
}
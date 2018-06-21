package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Bubble sort for integer and string
 */
public class BubbleSort 
{   	
	public static void main(String[] args)
	{
		//sorting integer
		Utility u=new Utility();
		/*System.out.println("Enter the size of the array:");
		int size=u.getInteger();
		int[] array = new int[size];
		for(int i=0; i<size;i++)
		{
			System.out.println("Enter the array element :");
			array[i]=u.getInteger();
			
		}
		int [] sortedArray=u.bubblesortInteger(array);
		for(int i=0; i<size;i++)
		{
			System.out.println("Sorted array: "+sortedArray[i]);
		}
		
		//sorting string
		System.out.println("Enter the size of the string:");
		int size1=u.getInteger();
		String string[]=new String[size1];
		for(int j=0; j<size1;j++)
		{
			System.out.println("Enter the string element :");
			string[j]=u.getString();
			
		}
		String [] sortedString=u.bubblesortString(string);
		for(int j=0; j<size1;j++)
		{
			System.out.println("Sorted  string : "+sortedString[j]);
	    }	*/
		//generics
		System.out.println("Enter the size of the array:");
		int size6=u.getInteger();
		Integer[] array4= new Integer[size6];
		for(int i=0; i<size6;i++)
		{
			System.out.println("Enter the array element :");
			array4[i]=u.getInteger();
		}
		Integer [] sortedArray1=u.bubblesort(array4);
		for(int i=0; i<size6;i++)
		{
			System.out.println("Sorted array: "+sortedArray1[i]);
		}
		System.out.println("Enter the size of the array:");
		int size5=u.getInteger();
		String string2[]=new String[size5];
		for(int j=0; j<size5;j++)
		{
			System.out.println("Enter the string element :");
			string2[j]=u.getString();
			
		}
		String [] sortedString2=u.bubblesort(string2);
		for(int j=0; j<size5;j++)
		{
			System.out.println("Sorted elements : "+sortedString2[j]);
	    }	
}
	
}

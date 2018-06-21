package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : sorting and searching 
 */
public class SortSearch
{
	public static void main(String[] args)
	{
		//bubblesorting integer
		Utility u=new Utility();
		u.start();
		System.out.println("Enter the size of the array:");
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
		
		System.out.println();
		u.stop();
		long l=u.getElapsedTime();
		System.out.println("Elapsed time in seconds: "+(l/1000)+" sec");
		
		//bubblesorting string
		System.out.println();
		u.start();
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
	    }	
		long l1=u.getElapsedTime();
		System.out.println("Elapsed time in seconds: "+(l1/1000)+" sec");
		
		//Insertion sorting integer
		System.out.println();
		u.start();
		System.out.println("Enter the size of the array:");
		int size3=u.getInteger();
		int[] array1 = new int[size3];
		for(int i=0; i<size3;i++)
		{
			System.out.println("Enter the array element :");
			array1[i]=u.getInteger();
		}
		int [] sortedArray1=u.insertionSortInteger(array);
		for(int i=0; i<size3;i++)
		{
			System.out.println("Sorted array: "+sortedArray1[i]);
	    }
		
		long l2=u.getElapsedTime();
		System.out.println("Elapsed time in seconds:"+(l2/1000)+" sec");
		
		//insertion sorting string
		System.out.println();
		u.start();
		System.out.println("Enter the size of the string:");
		int size2=u.getInteger();
		String str[]=new String[size2];
		for(int j=0; j<size2;j++)
		{
			System.out.println("Enter the string element :");
			str[j]=u.getString();
		}
		String [] sortedString1=u.insertionsortStr(str);
		for(int j=0; j<size2;j++)
		{
			System.out.println("Sorted  string : "+sortedString1[j]);
	    }	
		long l3=u.getElapsedTime();
		System.out.println("Elapsed time in seconds:"+(l3/1000)+" sec");
		
		//binarysearch integer
		System.out.println();
		u.start();
		System.out.println("Enter the size of the array:");
		int size21=u.getInteger();
		System.out.println("Enter the key :");
		int key2=u.getInteger();
		System.out.println("Enter the start value:");
		int start2=u.getInteger();
		System.out.println("Enter the end value :");
		Integer end2=u.getInteger();
		Integer[] array11 = new Integer[size21];
		for(int i=0; i<size21;i++)
		{
			System.out.println("Enter the array element :");
			array11[i]=u.getInteger();
		}
		u.binarySearchG(array11,start2,end2,key2);
		long l4=u.getElapsedTime();
		System.out.println("Elapsed time in seconds: "+(l4/1000)+" sec");
	    
		//binaruysearch string
		System.out.println();
		u.start();
		//Seaching string
		System.out.println("Enter the size of the array:");
		int size31=u.getInteger();
		System.out.println("Enter the key :");
		String key3=u.getString();
		System.out.println("Enter the start value:");
		Integer start3=u.getInteger();
		System.out.println("Enter the end value :");
		int end3=u.getInteger();
		String string1[]=new String[size31];
		for(int j=0; j<size31;j++)
		{
			System.out.println("Enter the string element :");
			string1[j]=u.getString();
					
		}
		u.binarySearchG(string1,start3,end3,key3);			
		long l5=u.getElapsedTime();
		System.out.println("Elapsed time in seconds: "+(l5/1000)+" sec"); 
	}
}
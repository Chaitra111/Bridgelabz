package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :
 */
public class SumOfThree
	{
		public static int distincttriplets(int array[])
		{
			System.out.println();
			int count=0;
			for(int i=0;i<array.length-2;i++)
			{
					if(array[i]+array[i+1]+array[i+2]==0)
					{
						System.out.println(array[i]+" "+array[i+1]+" "+array[i+2]+" = "+"0");
						count++;
						}
					}
			return count;
		}
		public static void main(String[] args)
		{
			Utility u1=new Utility();
			System.out.print("Enter size of Array :");
			int size=u1.getInteger();
			int arr[]=new int [size];

			for(int i=0;i<arr.length;i++)
			{
				System.out.print("Enter "+(i+1)+" Value :");
				arr[i]=u1.getInteger();
			}
			int sum=distincttriplets(arr);
			System.out.println("No.of tripltes :"+sum);
			System.out.println();
		}
	}
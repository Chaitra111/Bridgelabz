package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :
 */
public class SumOfThree
	{
		public static int distincttriplets(int array[],int length)
		{
			System.out.println();
			int i,j,k,count=0;
			for(i=0;i<length;i++)
			{
				for(j=i+1;j<length;j++)
				{
					for(k=j+1;k<length;k++)
					{
						if (array[i] + array[j] + array[k] == 0)
						{
							System.out.println(array[i] + " " + array[j] + " " + array[k]);
							count++;
						}
					}
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
			int sum=distincttriplets(arr,size);
			System.out.println("No.of tripltes :"+sum);
			System.out.println();
		}
	}
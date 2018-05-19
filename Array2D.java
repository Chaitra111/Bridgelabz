package com.bridgelabz.FunctioalPrograming;

import java.io.PrintWriter;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :  Print 2 Dimensional Array using use PrintWriter 
 */
public class Array2D 
{
	public static void main(String[] args)
	{
		Utility u=new Utility();      
		System.out.println("Enter number of rows: ");
		int rows = u.getInteger();
		System.out.println("Enter number of columns: ");
		int cols= u.getInteger(); 
		//calling methods
		int    [][] array1  =arrayInt(rows,cols);
		double [][] array2  =arrayDouble(rows,cols);
		String [][] array3  =arrayBoolean(rows,cols);
		display(array1 ,array2 ,array3 ,rows,cols);
	}	
		public static int[][] arrayInt(int rows,int cols)
		{
			int array1 [][]=new int[rows][cols];
			Utility u=new Utility();    
			System.out.println();
			System.out.println("Integer Array");
	
			for(int i = 0; i<rows; i++)
			{
				for (int j = 0; j<cols; j++)
			    {
					array1 [i][j] = u.getInteger();
			    }   
			}
			return array1;
		}
		
		public static double[][] arrayDouble(int rows,int cols)
		{
			double array2 [][]=new double[rows][cols];
			Utility u=new Utility();    
			System.out.println();
			System.out.println("Double Array");
	
			for(int i = 0; i<rows; i++)
			{
				for (int j = 0; j<cols; j++)
			    {
					array2 [i][j] = u.getDouble();
			    }   
			}
			return array2;
		}		
		public static String[][] arrayBoolean(int rows,int cols)
		{
			String array3 [][]=new String[rows][cols];
			Utility u=new Utility();    
			System.out.println();
			System.out.println("Boolean Array");
		
				for(int i = 0; i<rows; i++)
				{
					for (int j = 0; j<cols; j++)
					{
						array3 [i][j] = u.getString();
					}   
				}
			return array3;
		}
		//display array elements
		public static void display(int[][]array1 ,double[][]array2 ,String[][]array3 ,int rows,int cols)
		{
			PrintWriter pw=new PrintWriter(System.out,true);
			pw.println("2D ARRAY INTEGER");
			
			for(int i = 0; i<rows; i++)
			{
				for (int j = 0; j<cols; j++)
		        {
					pw.print("\t"+array1 [i][j]+" ");
		        } 
				pw.println("\t");
		    }
			System.out.println();
			pw.println("2D ARRAY DOUBLE");
				
			for(int i = 0; i<rows; i++)
			{
				for (int j = 0; j<cols; j++)
		        {
					pw.print("\t"+array2 [i][j]+" ");
			    } 
			pw.println("\t");
			}
			System.out.println();
			pw.println("2D ARRAY BOOLEAN");
			for(int i = 0; i<rows; i++)
			{
				for (int j = 0; j<rows; j++)
		        {
					pw.print("\t"+array3 [i][j]+" ");
				} 
			pw.println("\t");
			}
		}
}
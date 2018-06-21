package com.bridgelabz.AlgorithmPrograms;
import java.io.*;
import java.util.*;

import com.bridgelabz.Utility.Utility;

public class BinaryWord {

	
	public static void main(String[] args)
	{
			Utility u=new Utility();			
			File file=new File("/home/bridgeit/Desktop/chai.txt");
		    int count=0;
		    ArrayList<String> a=new ArrayList<String>();
		    try
		    {
			FileReader fr = new FileReader(file);
			BufferedReader fw = new BufferedReader(fr);
			String searchword = fw.readLine();
			System.out.println(searchword);
			while (searchword != null) {
				String[] str = searchword.split(",");

				for (int i = 0; i < str.length; i++) {
					a.add(str[i]);
					count++;
				}
				searchword = null;
			}
		       }
		     catch (Exception e)
		       {
		        e.printStackTrace();
		       }
		    String[] array =new String[count];
		    for(int i=0; i<a.size();i++) 
		      {
		        array[i]=a.get(i);
		      }
		    Arrays.sort(array);
		    System.out.println("Enter the search  string :");
		    
		    String search=u.getString();
		   
		   u.binarySearchG(array,0,array.length-1,search);
		   }
	}
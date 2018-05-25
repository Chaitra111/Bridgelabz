package com.bridgelabz.Utility;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : Two Strings are Anagram or not
 */
public class Utility 
{	
		//Method to get string value
		public String getString()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the input string");
			return scanner.nextLine();
		}
		
		//Method to get double value
		public double getDouble()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the double");
			return scanner.nextDouble();
		}
		
		//Method to get integer value
		public int getInteger()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the integer");
			return scanner.nextInt();
		}
	
		//Method to check leap year or not
		static int year;
		static int digits;
		public static void leapyear(int year, int digits)
		{
			if (digits==4)
			{
			if((year%4==0 || year%400==0) && (year%100!=0))
			{
			System.out.println("Leap year");
			}
			else{
			System.out.println("Not a Leap year");
			}
			}
		}
		
		//Method to find number of digits 
		 public static int integer;
		 public static int noOfDigits(int integer)
		 {
			int count=0;
			while(integer!=0)
			{
			integer=integer/10;
			count++; 
			}
			return count;
		}
		 
		 //Method to find prime factor
		 public void toFindPrime(int number)
		 {
			int i=2;
			while(number>1 && i*i<=number)
			{
				if(number%i==0)
				{
					number=number/i;
					System.out.println(+i);
				}
				else
				{
					i++;
				}
			}
		 }
	 
		 //Method to find tables of power of 2
		 public static int power;
		 public static int findPower(int power)
		 {
			int out=1;
			for(int i=1; i<power; i++)
			{
				out=(2*out);
				System.out.println(out);
			}
			return out;
		 }
		 
		 //Method to find the harmonic value
	 	 public static float harmonicvalue(int number)
	 	 {
			float out=1;
			if(number!=0)
			{
				for(float i=2; i<=number; i++)
				{
					out=out+1/i;
				}
			}
		return out;
		}
	 	 
	 	 //Method to find power of 2
		 public static int pwr;
		 public static int power(int pwr)
			{
				int out=1;
				for(int i=1; i<=pwr; i++)
				{
				out=(2*out);
				//System.out.println(out);
				}
				return out;
			}
		 
		 //Method to find prime number
		 public int prime()
			{
				for(int i=2;i<1000;i++)
				{
					boolean isPrime=true;
					for(int j=2; j<i; j++)
					{					
						if(i%j==0)
						{
			     		isPrime=false;
						}
			  	}
				if(isPrime)
				{
					System.out.println(i);
					
				}
			}
				return 1;
		}
		 
	    //Method to swap characters
		public static void swap(char[] chars,int start,int end)
		{		
			{	
				char temp=chars[start];
				chars[end]=chars[start];
				chars[start]=temp;
			}
		}
		
		//Method to check given string is anagram
		public void anagram(String s1,String s2)
		{
			char ch1[]=s1.toCharArray();
			Arrays.sort(ch1);
			System.out.println(ch1);
	
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch2);
		  	System.out.println(ch2);
	
			boolean res=Arrays.equals(ch1,ch2);
			if(res)
			{
			System.out.println("String is Anagram");
			}
			else
			{
			System.out.println("String is not Anagram");
		     }
		  }
		
		//Method to find palindrome
	   	static int number;
		public void palindrome(int number)
		{
			int rev=0;
			for(int i=2;i<1000;i++)
			{
		    number=i;
			while(number!=0)
			{
				int rem = number%10;
				rev=rem*10+rev;
				number/=number;			
			}
			System.out.println(rev);
			}
			//return rev;
			
		}
		
		//Method to find temperature 
		static double celcius;
		static double fahrenhit;
		public void tempConvert(double celcius, double fahrenhit)
		{
		 System.out.println("Temperature conversion from celcius to fahrenhit:" +((celcius*9.0)/5.0)+32); 
		 System.out.println("Temperature conversion from fahrenhit to celcius:"+((fahrenhit-32.0)*5.0)/9.0); 
		}
		
		//BubbleSort method for integer 
		static int [] array;
		public int[] bubblesortInteger(int [] array)
		{
			for(int i=0; i<array.length; i++)
			{
				for(int j=i+1; j<array.length; j++)
				{
					if(array[i]>array[j])
					{		
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			return array;
		}
		
		//BubbleSort method for String 
		static String[] string;
		public String[] bubblesortString(String []string)
		{
			for(int i=0; i<string.length; i++)
			{
				for(int j=i+1; j<string.length; j++)
				{
					if(string[i].compareTo(string[j])>0)
					{		
						String temp=string[i];
						string[i]=string[j];
						string[j]=temp;
					}
				}
			}
			return string;
		}
		
		//InsertionSort method for integer 
		static int [] arr;
		public int[] insertionSortInteger(int [] arr) 
		{
			for(int i=1; i<arr.length; i++)
			{
				int key =arr[i];
				int j=i-1;
				while(j>=0 && (arr[j]>key))
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=key;				
			}
			return arr;
		}
		
		//InsertionSort method for String 
		static String[] str;
		public String[] insertionsortStr(String[] str)
		{
			for(int i=1; i<str.length; i++)
			{
				String key =str[i];
				int j=i-1;
				while(j>=0 && str[j].compareTo(key)>0)
				{
					str[j+1]=str[j];
					j--;
				}
				str[j+1]=key;				
			}			
			return str;
	    }
		
		//BinarySearch   method   for   integer 
		static int mid;
		static int [] arr1;
		public int binarySearchInteger(int [] arr1, int key,int start,int end) 
		{
			//int start=0;
			//int end=arr1.length-1;
			int mid=(start+end)/2;
			while(mid>=0 && mid<arr1.length-1)
			{
				if(arr1[mid]==key)
				{
					return key;
				}
				else if(arr1[mid]>key)
				{
					return binarySearchInteger(arr1, key, 0,mid-1);
				}
				else if(arr1[mid]<key)
				{
					return binarySearchInteger(arr1,key,mid+1,end);
				}
			}
			return -1;
		}

		//BinarySearch method for String 
		static String midStr;
		static String [] str1;
		public int binarySearchString(String [] str1, String key,int start, int end) 
		{
			//int start = 0;
			//int end = str1.length;
			int mid=(start+end)/2;
			while(mid>=0 && mid<str1.length-1)
			{
				if(str1[mid].equals(key))
				{
					return mid;
				}
				else if(str1[mid].compareTo(key)<0)
				{
					return end = mid;
				}
				else if(str1[mid].compareTo(key)>0)
				{
					return start=mid + 1;
				}
			}
			return -1;
		}
		
		//Method to calculate elapsed time
		public long startTime=0;
		public long stopTime=0;
		public long elapsed;
		//to start timer
		public void start()
		{
			startTime=System.currentTimeMillis();
			System.out.println("Start Time is: "+startTime);
		}		
		// to stop timer
		public void stop()
		{
			stopTime=System.currentTimeMillis();
			System.out.println("Stop Time is: "+stopTime);
		}
		public long getElapsedTime()
		{
			elapsed=stopTime-startTime;
			return elapsed;
		}
		
		//Method for Merge sort
		private int[] array1;
        private int[] tempMergArr;
        private int length;     
        public int[] mergesort(int inputArr[])
        {
            this.array1 = inputArr;
            this.length = inputArr.length;
            this.tempMergArr = new int[length];
            doMergeSort(0, length - 1);
            return inputArr;
        }
    
        private void doMergeSort(int lowerIndex, int higherIndex) 
        {           
            if (lowerIndex < higherIndex)
            {
                int middle = lowerIndex + (higherIndex - lowerIndex) / 2;    // Below step sorts the left side of the array
                doMergeSort(lowerIndex, middle);                             // Below step sorts the right side of the array
                doMergeSort(middle + 1, higherIndex);                        // Now merge both sides
                mergeParts(lowerIndex, middle, higherIndex);
            }
        }
    
        private void mergeParts(int lowerIndex, int middle, int higherIndex) 
        {    
            for (int i = lowerIndex; i <= higherIndex; i++) 
            {
                tempMergArr[i] = array1[i];
            }
            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            while (i <= middle && j <= higherIndex)
            {
                if (tempMergArr[i] <= tempMergArr[j])
                {
                    array1[k] = tempMergArr[i];
                    i++;
                } else {
                    array1[k] = tempMergArr[j];
                    j++;
                }
                k++;
            }
            while (i <= middle)
            {
                array1[k] = tempMergArr[i];
                k++;
                i++;
            }    
        }
        
       	//BubbleSort method for integer    		
    	public <T extends Comparable>  T[] bubblesort(T [] array)
      		{
      			for(int i=0; i<array.length; i++)
      			{
      				for(int j=i+1; j<array.length; j++)
      				{
      					if(array[i].compareTo(array[j])>0)
      					{		
      						T temp=array[i];
      						array[i]=array[j];
      						array[j]=temp;
      					}
      				}
      			}
      			return array;
      		}
    	public <T extends Comparable> T[] insertionsortG(T[] str)
		{
			for(int i=1; i<str.length; i++)
			{
				T key =str[i];
				int j=i-1;
				while(j>=0 && str[j].compareTo(key)>0)
				{
					str[j+1]=str[j];
					j--;
				}
				str[j+1]=key;				
			}			
			return str;
	    }
    	
    	public <T extends Comparable> int binarySearchG(T[] str1, T key) 
		{
    		int start=0;
			int end=str1.length-1;
			int mid=(start+end)/2;
			while(mid>=0 && mid<str1.length-1)
			{
				if(str1[mid].equals(key))
				{
					return mid;
				}
				else if(str1[mid].compareTo(key)<0)
				{
					return	end = mid - 1;
				}
				else if(str1[mid].compareTo(key)>0)
				{
					return start = mid + 1;
				}
			}
			return -1;
	}
    	
		
    	
}
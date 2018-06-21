package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;

public class PrimePalindrome 
{
	
		public static void main(String[] args) {
			int count = 0;
			for (int i = 0; i <= 1000; i++) {
				if (Utility.findPrime(i) == true)
					count++;
			}
			String arr[] = new String[count];
			int index = 0;
			for (int i = 0; i <= 1000; i++) {
				if (Utility.findPrime(i))
					arr[index++] = i + "";
			}
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (Utility.anag(arr[i], arr[j]))
						System.out.println("[" + arr[i] + "," + arr[j] + "]");
				}
			}
		}
	}
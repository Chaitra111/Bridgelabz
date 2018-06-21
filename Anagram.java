package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;

public class Anagram 
{		
	public static void main(String[] args)
	{
		String string1= Utility.getString();
		String string2= Utility.getString();
		//u.anagram(string1,string2);
		
		System.out.println(detectAnagram(string1,string2)? "Words are Anagram" : "Words are not Anagram");
	}

	public static boolean detectAnagram(String first,String second){

		//If length of both words are not same then they are not anagram.
		if(first.length()!=second.length())
			return false;

		for(int i=0;i<second.length();i++){
			char c=first.charAt(i);
			if(second.indexOf(c)==-1)
				return false;
		}

		return true;
	}
}

package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Utility;

public class PalindromeChecker {
	
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		DequeUtil<Character> utility = new DequeUtil<Character>();
		System.out.println("Enter a String: ");
		String s = u.getString();

		// adding each character to the rear of the deque
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			utility.addRear(c);
		}
		if (utility.size() > 1) {
			if (utility.removeFront() != utility.removeRear()) {
				System.out.println("String is not palindrome");
			} else {
				System.out.println("String is palindrome");
			}
		}

	}
}

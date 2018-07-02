package com.adrressbook.utility;

import java.util.Scanner;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Utility class for address book application
 */
public class Utility {

	public static Scanner scanner = new Scanner(System.in);

	public static String getString() {
		return scanner.next();
	}

	public static int getInteger() {
		return scanner.nextInt();
	}

	public static Double getDouble() {
		return scanner.nextDouble();
	}

	public static boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public static Long getLong() {
		return scanner.nextLong();
	}
}
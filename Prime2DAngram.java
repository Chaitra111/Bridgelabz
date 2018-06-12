package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Utility;

public class Prime2DAngram {
	public static void main(String[] args) {
		LinkedList[][] array = new LinkedList[100][];
		for (int i = 0; i < 10; i++) {
			array[i] = new LinkedList[100];
			for (int j = 0; j < 100; j++) {
				array[i][j] = new LinkedList();
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 100 * i; j < 100 * (i + 1) - 1; j++) {
				int k = 0;

				for (int m = j + 1; m < 100 * (i + 1); m++) {
					if (Utility.findPrime(j) == true && Utility.findPrime(m) == true) {
						if (Utility.anag(("" + j), ("" + m)) == true) {
							array[i][k].add(j);
							k++;
							System.out.println("[" + j + "," + m + "]" );
						}
					}
				}
			}

			System.out.println();
		}
	}
}
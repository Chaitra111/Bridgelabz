package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Utility;

public class Prime2DReverse {

		public static void main(String[] args) {
		StackLogic s = new StackLogic(100);
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

							s.push(j);
							s.push(m);
						}
					}
				}
			}
		}
		s.display();
	}
	}
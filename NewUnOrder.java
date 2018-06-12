package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgelabz.Utility.Utility;

	/**
	 * @author Chaitra Ankolekar
	 * Date : 18/05/2018
	 * purpose Read the Text from a file, split it into words and arrange it as Linked List.
	 * Take a user input to search a Word in the List. If the Word is not found then add it 
	 * to the list, and if it found then remove the word from the List. In the end save the 
	 * list into a file.
	 * 
	 */
	public class NewUnOrder {
		
	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath = "/home/bridgeit/Desktop/chaitra.txt";
		LinkedList1 l = new LinkedList1();
		String word = null;
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		try {
			while ((word = bufferReader.readLine()) != null) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					l.add(str[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		l.display();
		System.out.println("enter the word you want to search");
		String searchWord = Utility.getString();
		if (l.search(searchWord)) {
			System.out.println("word found ");
			l.remove(searchWord);
		} else {
			System.out.println("word not found add to the list");
			l.addLast(searchWord);
			l.display();
		}
		// save modified list to the file
		PrintWriter writer = new PrintWriter("/home/bridgeit/Desktop/chaitra.txt");
		for (int i = 0; i < l.getCount(); i++) {
			writer.print((Comparable) l.getNth(i) + " ");
		}
		writer.close();
	}
}

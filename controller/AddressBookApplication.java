package com.addressbook.controller;

import com.addressbook.addressbookfactory.services.AddressBookManager;
import com.addressbook.addressbookfactory.services.AddressBookManagerImplementation;
import com.adrressbook.utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Address book main class
 */
public class AddressBookApplication {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		// String file_type = args[0];
		String res = "";

		System.out.println("Enter * for json");
		System.out.println("Enter # for jdbc");
		String data = Utility.getString();
		
		switch (data) {
		case "*":
			res = AnnotationExecution.jsonMethod();
			break;
		case "#":
			res = AnnotationExecution.jdbcMethod();
			break;
		}

		AddressBookManager addressBookManager = new AddressBookManagerImplementation(res);
		System.out.println("1: CREATE THE NEW ADDRESSBOOK");
		System.out.println("2: VIEW THE ADDRESSBOOKS");
		System.out.println("3: OPEN AND EDIT THE EXISTED ADDRESSBOOK");
		System.out.println("4: DELETE THE ADDRESSBOOK");
		System.out.println("5: EXIT THE ADDRESSBOOK");
		int choice = 0;
		while (choice < 5) {
			System.out.println("enter your choice to do which operation");
			choice = Utility.getInteger();
			switch (choice) {
			case 1:
				System.out.println("Enter address book name");
				String addressBook = Utility.getString();
				addressBookManager.createAddressBook(addressBook);
				System.out.println("1:Add Person");
				System.out.println("2:Quit the address book");
				int j = 0;
				while (j < 3) {
					System.out.println("enter your choice to do which operation");
					j = Utility.getInteger();
					switch (j) {
					case 1:
						addressBookManager.addPerson(addressBook);
						break;
					case 2:
						System.out.println("Exit the address book");
						break;
					}
					j++;
				}
				break;
			case 2:
				addressBookManager.view_AddressBook();
				break;
			case 3:
				System.out.println("Enter address book name");
				String addressBook2 = Utility.getString();
				addressBookManager.openAddressBook(addressBook2);
				System.out.println("1:Add Preson Address");
				System.out.println("2:Update person address");
				System.out.println("3:Delete Person addresss");
				int k = 0;
				while (k < 4) {
					System.out.println("enter your choice ");
					k = Utility.getInteger();
					switch (k) {
					case 1:
						addressBookManager.addPerson(addressBook2);
						break;
					case 2:
						addressBookManager.updatePerson(addressBook2);
						break;
					case 3:
						addressBookManager.removePerson(addressBook2);
					}
					k++;
				}
				break;

			case 4:
				System.out.println("Enter address book name");
				String addressBook1 = Utility.getString();
				addressBookManager.delete_AddressBook(addressBook1);
				break;
			case 5:
				System.out.println("Exit");
				break;
			}
		}
	}

}
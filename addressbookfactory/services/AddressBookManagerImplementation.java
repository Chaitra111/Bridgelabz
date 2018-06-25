package com.addressbook.addressbookfactory.services;

import com.addressbook.files.Serialization;
import com.adrressbook.utility.Utility;
import com.addressbook.files.AddressFactory;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Implementation class for addressbook manager
 */
public class AddressBookManagerImplementation implements AddressBookManager {
	
	Serialization serializer;
	Person person = new Person();

	public AddressBookManagerImplementation(String fileType) {
		serializer = AddressFactory.getFileType(fileType);
	}

	@Override
	public void createAddressBook(String addressBook) {
		serializer.create(addressBook);
	}

	public void openAddressBook(String addressBook) {
		serializer.open(addressBook);
	}

	public void view_AddressBook() {
		serializer.view();
	}

	@Override
	public void delete_AddressBook(String addressBook) {
		serializer.delete(addressBook);
	}

	@Override
	public void addPerson(String addressBook) {
		System.out.println("Enter first name");
		String firstName = Utility.getString();
		person.setFirstName(firstName);
		System.out.println("Enter Last name");
		String lastName = Utility.getString();
		person.setLastName(lastName);
		System.out.println("Enter address");
		String address = Utility.getString();
		person.setAddress(address);
		System.out.println("Enter city ");
		String city = Utility.getString();
		person.setCity(city);
		System.out.println("Enter state");
		String state = Utility.getString();
		person.setState(state);
		System.out.println("Enter Zip");
		int zip = Utility.getInteger();
		person.setZip(zip);
		System.out.println("Enter phone number");
		long phone = Utility.getLong();
		person.setPhone(phone);
		serializer.savePerson(person, addressBook);
	}

	@Override
	public void updatePerson(String addressBook) {
		System.out.println("Enter first name");
		String firstName = Utility.getString();
		person.setFirstName(firstName);
		System.out.println("Enter address");
		String address = Utility.getString();
		person.setAddress(address);
		System.out.println("Enter city ");
		String city = Utility.getString();
		person.setCity(city);
		System.out.println("Enter state");
		String state = Utility.getString();
		person.setState(state);
		System.out.println("Enter Zip");
		int zip = Utility.getInteger();
		person.setZip(zip);
		System.out.println("Enter phone number");
		long phone = Utility.getLong();
		person.setPhone(phone);
		serializer.updatePerson(person, addressBook);
	}

	@Override
	public void removePerson(String addressBook) {
		System.out.println("Enter first name");
		String firstName = Utility.getString();
		person.setFirstName(firstName);
		serializer.deletePerson(person, addressBook);
	}
}
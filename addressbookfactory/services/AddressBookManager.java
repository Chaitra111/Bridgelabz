package com.addressbook.addressbookfactory.services;

	/**
	 * @author Chaitra Ankolekar
	 * Date : 18/05/2018
	 * Purpose :Interface
	 */
	public interface AddressBookManager {
		
	public void createAddressBook(String addressBook);

	public void openAddressBook(String addressBook);

	public void view_AddressBook();

	public void delete_AddressBook(String addressBook);

	public void addPerson(String addressBook);

	public void updatePerson(String addressBook);

	public void removePerson(String addressBook);
}
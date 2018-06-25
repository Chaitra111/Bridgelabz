package com.addressbook.files;

import com.addressbook.addressbookfactory.services.Person;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Interface 
 */
public interface Serialization {
	
	public void create(String addressBook);

	public void open(String addressBook);

	public void view();

	public void delete(String addressBook);

	public void savePerson(Person person, String addressBook);

	public void updatePerson(Person person, String addressBook);

	public void deletePerson(Person person, String addressBook);

}
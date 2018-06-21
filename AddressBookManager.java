package com.bridgaelabz.addressbook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018 
 * Purpose :
 */
public class AddressBookManager extends Object {
	AddressBook addressBook =new AddressBook();
	Utility utility = new Utility();
	Person person = new Person();
	public AddressBookManager()  {

	}
	
	public void doNew() throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		System.out.println("Enter the new address book name");
		String addressBookName = Utility.getString();
		
		File file1=new File("/home/bridgeit/Documents/program_chaitra/bridgelabz/src/com/temp/"+addressBookName+".json");

		//addressBook.addressFiles.add(file1);

		addressBook.mapper.writeValue(file1,addressBook.addressFiles);
		System.out.println("new file created");

	}
	
	public void doAdd(String file) throws JsonGenerationException, JsonMappingException, IOException, ParseException {	
		
		System.out.println("Enter first name");
		String firstName = Utility.getString();

		System.out.println("Enter last name");
		String lastName = Utility.getString();
		
		System.out.println("Enter Adaress ");
		String address = Utility.getString();
		
		System.out.println("Enter city");
		String city = Utility.getString();
		
		System.out.println("Enter state");
		String state = Utility.getString();
		
		System.out.println("Enter zip");
		String zip = Utility.getString();
		
		System.out.println("Enter phone");
		String phone = Utility.getString();
		
		addressBook.addPerson(firstName, lastName, address, city, state, zip, phone, file );	
	
			
	}
//Find the particular file
	public String findFile() {
		System.out.println("Enter file name which you want ");
		String fileName=Utility.getString();
		File dir = new File("/home/bridgeit/Documents/program_chaitra/bridgelabz/src/com/temp/");
		 String[] children = dir.list();
		/*for(int i=0;i<children.length;i++)	 
		 System.out.println(children[i]);*/
		int i=0;
        String  filename = children[i];
       
       while (i<children.length && !filename.contains(".json")){
           i++;
           filename = children[i];
       }
       String file1="/home/bridgeit/Documents/program_chaitra/bridgelabz/src/com/temp/"+fileName+".json";
       //System.out.println(fileName);
       return file1;
	}
	
	public void doView() {
		File dir = new File("/home/bridgeit/Documents/program_chaitra/bridgelabz/src/com/temp/");
		 String[] children = dir.list();
		for(int i=0;i<children.length;i++) {	 
		 System.out.println(children[i]);}
	}

	
	public void doEdit(int index,String file) throws JsonGenerationException, JsonMappingException, IOException, ParseException  {
		
		System.out.println("Edit Adaress ");
		String address = Utility.getString();
		
		System.out.println("Edit city");
		String city = Utility.getString();
		
		System.out.println("Edit state");
		String state = Utility.getString();
		
		System.out.println("Edit zip");
		String zip = Utility.getString();
		
		System.out.println("Edit phone");
		String phone = Utility.getString();
		
		addressBook.updatePerson(index, address, city, state, zip, phone,file);
	}

	
	public void doDelete(int index,String file) throws FileNotFoundException, IOException, ParseException {
		
		addressBook.removePerson(index,file);
	}
	public void doDeleteAddressBook(String fileName) {
		File file=new File(fileName);
		file.delete();
	}
	
	public void doGetPersonName(int index,String file) throws FileNotFoundException, IOException, ParseException {
		
		String name=addressBook.getFullNameOfPerson(index, file);
		System.out.println("full name: "+name);
		int noOfPersons=addressBook.getNumberOfPersons(file);
		System.out.println("noOfPersons "+noOfPersons);
	}
	

	public void doOpen() throws FileNotFoundException, IOException, ParseException {
		
		File dir = new File("/home/bridgeit/Documents/program_chaitra/bridgelabz/src/com/temp/");
		 String[] children = dir.list();
		for(int i=0;i<children.length;i++)	 
		 System.out.println(children[i]);
		String file=findFile();
		addressBook.printAll(file);
	}

	
	public void doSortByName(String file) throws FileNotFoundException, IOException, ParseException {
		
		addressBook.sortByName(file);
	}
	
	public void doSortByZip(String file) throws FileNotFoundException, IOException, ParseException {
		
		addressBook.sortByZip(file);
	}
	
   
    public void doGet(int index,String file) throws FileNotFoundException, IOException, ParseException {
    	
    	String[] info=addressBook.getOtherPersonInformation(index, file);
    	for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
    }
}
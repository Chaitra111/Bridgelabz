package com.addressbook.files;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Factory class for json and jdbc
 */
public class AddressFactory  {
	
    public static Serialization getFileType(String fileType) {
   	 if(fileType.equalsIgnoreCase("json")) {
   		 return new JsonSerialization();
   	 }
   	 if(fileType.equalsIgnoreCase("jdbc")) {
   		 return new JdbcSerialization();
   	 }
   	 return null;
    }
}
package com.addressbook.files;

import java.sql.*;
import java.util.ArrayList;

import com.addressbook.addressbookfactory.services.Person;



public class JdbcSerialization implements Serialization {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ArrayList<Person> personList = new ArrayList<>();

	public Connection setConnection() {
		try {
			con = DataSource.getInstance().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void create(String addressBookName) {

		/*
		 * System.out.println("Enter the new address book table name"); String
		 * addressBookName = Utility.userInputString();
		 */
		String insert = "insert into addressbook values('" + addressBookName + "')";
		Statement statement1 = null;
		String query = "create table " + addressBookName
				+ "(id int(2) auto_increment,first_name varchar(15),last_name varchar(10),address varchar(20),city varchar(20),state varchar(3),zip int(5),phone_num int(10),primary key(id))";
		try {
			stmt = setConnection().createStatement();
			stmt.execute(query);
			System.out.println("new AddressBook Created");

			statement1 = setConnection().createStatement();
			statement1.execute(insert);
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void open(String addressBook) {
		boolean found = false;
		
		String addressBooks = "select * from   addressbook ";
		try {
			stmt = setConnection().createStatement();
			rs = stmt.executeQuery(addressBooks);
			while (rs.next()) {
				if (rs.getString(1).equalsIgnoreCase(addressBook)) {
					System.out.println("address book found");
					found = true;
					break;
				}
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (!found) {
			System.out.println("address book not found");
		}
	}

	@Override
	public void delete(String addressBook) {
		String delete = "delete from addressbook where name='" + addressBook + "'";
		String drop = "drop table " + addressBook;
		try {
			//statement = setConnection().createStatement();
			//statement.execute(delete);
			stmt = setConnection().createStatement();
			stmt.execute(drop);
			System.out.println("deleted the addressbook");
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void view() {
		String addressBooks = "select * from addressbook";
		try {
			stmt = setConnection().createStatement();
			rs = stmt.executeQuery(addressBooks);
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void savePerson(Person person, String addressBook) {

		String insert = "insert into " + addressBook + " values(?,?,?,?,?,?,?,?)";
		try {
			pstmt = setConnection().prepareStatement(insert);
			pstmt.setInt(1, 0);
			pstmt.setString(2, person.getFirstName());
			pstmt.setString(3, person.getLastName());
			pstmt.setString(4, person.getAddress());
			pstmt.setString(5, person.getCity());
			pstmt.setString(6, person.getState());
			pstmt.setInt(7, person.getZip());
			pstmt.setLong(8, person.getPhone());
			pstmt.execute();
			System.out.println("Person address added successfully");
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updatePerson(Person person, String addressBook) {
		String update = "update " + addressBook + " set address=?, city=?, state=?, zip=?, phone=? where first_name=?";
		try {
			pstmt = setConnection().prepareStatement(update);
			pstmt.setString(1, person.getAddress());
			pstmt.setString(2, person.getCity());
			pstmt.setString(3, person.getState());
			pstmt.setInt(4, person.getZip());
			pstmt.setLong(5, person.getPhone());
			pstmt.setString(6, person.getFirstName());
			pstmt.executeUpdate();
			System.out.println("updated person address successfully");
			closeConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void deletePerson(Person person, String addressBook) {
		String delete = "delete from " + addressBook + " where first_name='" + person.getFirstName() + "'";
		try {
			stmt = setConnection().createStatement();
			stmt.execute(delete);
			System.out.println("Deleted the person");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection() throws SQLException {
		if(rs!=null) {
			rs.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(con!=null) {
			con.close();
		}
	}

}
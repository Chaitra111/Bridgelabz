package com.addressbook.files;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Connection pooling
 */
public class DataSource {

	private static DataSource dataSource;
	private ComboPooledDataSource comboPooledDataSource;

	private DataSource() throws PropertyVetoException {
		comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/AddressBook");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");

		comboPooledDataSource.setMinPoolSize(3);
		comboPooledDataSource.setAcquireIncrement(5);
		comboPooledDataSource.setMaxPoolSize(20);
		comboPooledDataSource.setMaxStatements(180);
	}

	public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
		if (dataSource == null) {
			dataSource = new DataSource();
			return dataSource;
		} else {
			return dataSource;
		}
	}

	public Connection getConnection() throws SQLException {
		return this.comboPooledDataSource.getConnection();
	}
}
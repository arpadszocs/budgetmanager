package com.finance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection implements DBConnection {

	private Connection connect;
	private Statement statement;
	private static MySQLConnection instance;

	private MySQLConnection() {
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://localhost/budgetmanager?";
		final String username = "root";
		try {
			Class.forName(driver);
			this.connect = DriverManager.getConnection(url + "user=" + username);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static MySQLConnection getInstance() {
		if (instance == null) {
			instance = new MySQLConnection();
		}
		return instance;
	}

	@Override
	public ResultSet select(final String selectQuery) throws SQLException {
		this.statement = this.connect.createStatement();
		return this.statement.executeQuery(selectQuery);
	}

	@Override
	public int insert(final String insertQuery) throws SQLException {
		this.statement = this.connect.createStatement();
		return this.statement.executeUpdate(insertQuery);
	}

}

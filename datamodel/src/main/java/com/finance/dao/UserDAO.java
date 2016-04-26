package com.finance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.finance.datamodel.User;

public class UserDAO {

	private final DBConnection dbConnection;

	public UserDAO(final DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public void save(final User user) throws SQLException {
		final String saveQuery = "INSERT INTO user(Name, Email) VALUES (" + user.getName() + " ," + user.getEmail()
				+ ")";
		this.dbConnection.insert(saveQuery);
	}

	public void update(final User user) throws SQLException {
		final String updateQuery = "UPDATE user SET Name=" + user.getName() + ",Email=" + user.getEmail()
				+ " WHERE ID = " + user.getId();
		this.dbConnection.insert(updateQuery);
	}

	public void delete(final User user) throws SQLException {
		final String deleteQuery = "DELETE FROM user WHERE ID = " + user.getId();
		this.dbConnection.insert(deleteQuery);
	}

	public User findById(final Integer id) throws SQLException {
		final String selectQuery = "SELECT * FROM user WHERE ID = " + id;
		final ResultSet rs = this.dbConnection.select(selectQuery);
		return new User(id, rs.getString(1), rs.getString(2));
	}

	public User findByName(final String name) throws SQLException {
		final String selectQuery = "SELECT * FROM user WHERE Name = " + name;
		final ResultSet rs = this.dbConnection.select(selectQuery);
		return new User(rs.getInt(0), name, rs.getString(2));
	}

}

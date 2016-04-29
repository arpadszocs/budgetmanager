package com.finance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.finance.movierental.Rental;

public class RentalDAO {

	private final DBConnection dbConnection;

	public RentalDAO(final DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public void save(final Rental rental) throws SQLException {
		final String saveQuery = "INSERT INTO rental(FilmID, UserID, StartDate, EndDate) VALUES (" + rental.getFilmId()
				+ "," + rental.getUserId() + "," + rental.getStartDate() + "," + rental.getEndDate() + ")";
		this.dbConnection.insert(saveQuery);
	}

	public void update(final Rental rental) throws SQLException {
		final String updateQuery = "UPDATE rental SET Name=" + rental.getFilmId() + ",Length=" + rental.getUserId()
				+ "Genre=" + rental.getStartDate() + "Year=" + rental.getEndDate() + "WHERE ID=" + rental.getId();
		this.dbConnection.insert(updateQuery);
	}

	public void delete(final Rental rental) throws SQLException {
		final String deleteQuey = "DELETE FROM rental WHERE ID = " + rental.getId();
		this.dbConnection.insert(deleteQuey);
	}

	public Rental findByFilmId(final Integer filmId) throws SQLException {
		final String selectQuery = "SELECT * FROM rental WHERE FIlmID = " + filmId;
		final ResultSet resultSet = this.dbConnection.select(selectQuery);
		return new Rental(filmId, resultSet.getInt(1), resultSet.getInt(2), resultSet.getDate(3), resultSet.getDate(4));
	}

	public Rental findByUserId(final Integer userId) throws SQLException {
		final String selectQuery = "SELECT * FROM rental WHERE UserID = " + userId;
		final ResultSet resultSet = this.dbConnection.select(selectQuery);
		return new Rental(resultSet.getInt(0), userId, resultSet.getInt(2), resultSet.getDate(3), resultSet.getDate(4));
	}

}

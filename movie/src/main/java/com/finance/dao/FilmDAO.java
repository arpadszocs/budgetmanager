package com.finance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.finance.movierental.Film;

public class FilmDAO {

	private final DBConnection dbConnection;

	public FilmDAO(final DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public void save(final Film film) throws SQLException {
		final String saveQuery = "INSERT INTO film(Name, Length, Genre, Year) VALUES (" + film.getName() + ","
				+ film.getLength() + "," + film.getGenre() + "," + film.getYear() + ")";
		this.dbConnection.insert(saveQuery);
	}

	public void update(final Film film) throws SQLException {
		final String updateQuery = "UPDATE film SET Name=" + film.getName() + ",Length=" + film.getLength() + "Genre="
				+ film.getGenre() + "Year=" + film.getYear() + "WHERE ID=" + film.getId();
		this.dbConnection.insert(updateQuery);
	}

	public void delete(final Film film) throws SQLException {
		final String deleteQuey = "DELETE FROM film WHERE ID = " + film.getId();
		this.dbConnection.insert(deleteQuey);
	}

	public List<Film> findByName(final String name) throws SQLException {
		final List<Film> filmList = new ArrayList<>();
		final String selectQuery = "SELECT * FROM film WHERE Name = " + name;
		final ResultSet resultSet = this.dbConnection.select(selectQuery);
		while (resultSet.next()) {
			filmList.add(new Film(resultSet.getInt(0), resultSet.getString(1), resultSet.getInt(2),
					resultSet.getString(3), resultSet.getInt(4)));
		}
		return filmList;
	}

	public List<Film> findByGenre(final String genre) throws SQLException {
		final List<Film> filmList = new ArrayList<>();
		final String selectQuery = "SELECT * FROM film WHERE Genre = " + genre;
		final ResultSet resultSet = this.dbConnection.select(selectQuery);
		while (resultSet.next()) {
			filmList.add(new Film(resultSet.getInt(0), resultSet.getString(1), resultSet.getInt(2),
					resultSet.getString(3), resultSet.getInt(4)));
		}
		return filmList;
	}

	public List<Film> findByYear(final Integer year) throws SQLException {
		final List<Film> filmList = new ArrayList<>();
		final String selectQuery = "SELECT * FROM film WHERE Year = " + year;
		final ResultSet resultSet = this.dbConnection.select(selectQuery);
		while (resultSet.next()) {
			filmList.add(new Film(resultSet.getInt(0), resultSet.getString(1), resultSet.getInt(2),
					resultSet.getString(3), resultSet.getInt(4)));
		}
		return filmList;
	}

}

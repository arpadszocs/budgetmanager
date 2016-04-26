package com.finance.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DBConnection {

	ResultSet select(final String selectQuery) throws SQLException;

	int insert(final String insertQuery) throws SQLException;
}

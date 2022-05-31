package com.qa.maven;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LearningJDBC {

    public static final Logger LOGGER = LogManager.getLogger(LearningJDBC.class);

    private String jdbcConnectionURL;
    private String username;
    private String password;

    public LearningJDBC(String username, String password) {
        jdbcConnectionURL = "jdbc:mysql://localhost:3306/ims";
        this.username = username;
        this.password = password;
    }

    public LearningJDBC(String jdbcConnectionURL, String username, String password) {
        this.jdbcConnectionURL = jdbcConnectionURL;
        this.username = username;
        this.password = password;
    }

    public void readAll() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
        } catch (SQLException e) {
            LOGGER.debug(e.getStackTrace());
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    public class ViewRecord {
    	public ViewRecord movieFromResultSet(ResultSet resultSet) throws SQLException {
    	    Long id = resultSet.getLong("id");
    	    String movieName = resultSet.getString("title");
    	    return new ViewRecord(id, movieName);
    	}

    	public ViewRecord readMovie(Long id) {
    	    try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
    	            Statement statement = conn.createStatement();
    	            ResultSet resultSet = statement.executeQuery("SELECT title FROM movies")) {

    	        resultSet.next();
    	        return movieFromResultSet(resultSet);
    	    } catch (SQLException e) {
    	        LearningJDBC.LOGGER.debug(e.getStackTrace());
    	    }
    	    return null;
    	}
}
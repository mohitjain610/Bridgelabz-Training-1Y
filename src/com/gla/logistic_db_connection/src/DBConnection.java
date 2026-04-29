package com.gla.logistic_db_connection.src;

import java.sql.*;

class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/logistics";
    static final String USER = "root";
    static final String PASS = "mohit.@123";

    static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
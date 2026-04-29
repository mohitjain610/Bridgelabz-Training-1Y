package com.gla.logistic_db_connection.src;

import java.sql.Connection;
import java.sql.PreparedStatement;



import java.sql.*;

public class DBService {

    public static void insertDriver(Driver d) throws Exception {

        Connection con = DBConnection.getConnection();

        // ✅ Avoid duplicate error
        String sql = "INSERT IGNORE INTO driver VALUES (?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, d.driverId);
        ps.setString(2, d.name);

        ps.executeUpdate();
        con.close();
    }

    public static void insertCheckpoint(String driverId, Checkpoint c) throws Exception {

        Connection con = DBConnection.getConnection();

        // ✅ Avoid duplicate checkpoint insert
        String sql = "INSERT IGNORE INTO checkpoint VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, c.checkpointId);
        ps.setString(2, driverId);
        ps.setString(3, c.getType());
        ps.setString(4, c.locationName);
        ps.setDouble(5, c.distanceFromLast);
        ps.setInt(6, c.expectedDuration);
        ps.setInt(7, c.actualDuration);

        ps.executeUpdate();
        con.close();
    }
}
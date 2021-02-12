import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
        
//package com.mycompany.crud;

public class Main {

    public static void main(String args[]) {
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://<localhost>:<1433>;databaseName=rod;user=<user>;password=<linuxRod1234>";
        
        String SQL = "SELECT * FROM usuarios";
        
        String insertSql = "INSERT INTO usuario (nome_usuario, senha_usuario) VALUES "
                + "('danilo','12345');";
        
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery(SQL);
            ResultSet inserSQL = stmt.executeQuery(insertSql);

        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

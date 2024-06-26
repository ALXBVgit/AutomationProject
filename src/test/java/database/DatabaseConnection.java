package database;

import loggerUtility.LoggerUtiliyy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    //clasa care are ca scop sa faciliteze conexiunea cu o baza de date
    private Connection connection;

    public DatabaseConnection() {
        prepareConnection();
    }

    //metoda care face conexiunea la baza de date
    private void prepareConnection(){
        String url = "jdbc:mysql://localhost:3306/AutomationlDB";
        try {
            connection = DriverManager.getConnection(url, "root", "hicom123!");
            LoggerUtiliyy.infotest("Connected to DB");
        } catch (SQLException e) {
            LoggerUtiliyy.errorTest(e.getMessage());
        }
    }

    public void closeConnection(){
        try {
            connection.close();
            LoggerUtiliyy.infotest("DB connection closed");
        } catch (SQLException e) {
            LoggerUtiliyy.errorTest(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

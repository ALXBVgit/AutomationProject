package database.Queries;

import database.DatabaseConnection;
import loggerUtility.LoggerUtiliyy;
import objectData.AlertObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.bidi.log.Log;

import java.sql.SQLException;
import java.sql.Statement;

public class AlertTable {
    //clasa care reprezinta un tabel specific
    private DatabaseConnection dbConnection;

    public AlertTable() {
        dbConnection = new DatabaseConnection();
    }

    //definim metode pentru interactiunea cu un tabel
    public void insertIntoAlert(AlertObject testdata){
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into alertTable (alertPrompt, entryDate)" +
                    "values ('"+testdata.getAlertValue()+"', 'luni, 17 iulie')";
            statement.execute(query);
        } catch (SQLException e) {
            LoggerUtiliyy.errorTest(e.getMessage());
        }

    }
}

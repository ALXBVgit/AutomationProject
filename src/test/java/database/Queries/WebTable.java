package database.Queries;

import database.DatabaseConnection;
import loggerUtility.LoggerUtiliyy;
import objectData.PracticeFormObject;
import objectData.WebTableObject;

import java.sql.SQLException;
import java.sql.Statement;

public class WebTable {
    private DatabaseConnection dbConnection;

    public WebTable() {
        dbConnection = new DatabaseConnection();
    }


    public void insertIntowebTable(WebTableObject testdata){
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into webTable (firstnameValue, lastNameValue, emailAddr, ageValue, salaryValue, departmentValue)" +
                    "values ('"+testdata.getFirstnameValue()+"', '"+testdata.getLastNameValue()+"', '"+testdata.getEmailAddr()+"', '"+testdata.getAgeValue()+"', '"+testdata.getSalaryValue()+"', '"+testdata.getDepartmentValue()+"')";
            statement.execute(query);
        } catch (SQLException e) {
            LoggerUtiliyy.errorTest(e.getMessage());
        }

    }
}

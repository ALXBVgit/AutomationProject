package database.Queries;

import database.DatabaseConnection;
import loggerUtility.LoggerUtiliyy;
import objectData.AlertObject;
import objectData.PracticeFormObject;

import java.sql.SQLException;
import java.sql.Statement;

public class PracticeFormTable {

    private DatabaseConnection dbConnection;

    public PracticeFormTable() {
        dbConnection = new DatabaseConnection();
    }

    public void insertIntoPracticeForm(PracticeFormObject testdata){
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into practiceFormTable (firstNameValue, lastNameValue, emailValue, mobileNumValue, monthDateOfBirthValue, yearOfBirthValue, dobDayvalue, genderValue, hobbies, subjectValue, filePath, addressFieldValue, stateInputValue, cityValue)" +
                    "values ('"+testdata.getFirstNameValue()+"', '"+testdata.getLastNameValue()+"', '"+testdata.getEmailValue()+"', '"+testdata.getMobileNumValue()+"', '"+testdata.getMonthDateOfBirthValue()+"', '"+testdata.getYearOfBirthValue()+"', '"+testdata.getDobDayvalue()+"', '"+testdata.getGenderValue()+"', '"+testdata.getHobbies()+"', '"+testdata.getSubjectValue()+"', '"+testdata.getFilePath()+"', '"+testdata.getAddressFieldValue()+"', '"+testdata.getStateInputValue()+"', '"+testdata.getCityValue()+"')";
            statement.execute(query);
        } catch (SQLException e) {
            LoggerUtiliyy.errorTest(e.getMessage());
        }

    }
}

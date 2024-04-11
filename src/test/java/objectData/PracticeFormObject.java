package objectData;

import java.util.List;
import java.util.Map;

public class PracticeFormObject extends GeneralObject{

    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String mobileNumValue;
    private String monthDateOfBirthValue;
    private String yearOfBirthValue;
    private String dobDayvalue;
    private String genderValue;
    private List<String> hobbies;
    private String subjectValue;
    private String filePath;
    private String addressFieldValue;
    private String stateInputValue;
    private String cityValue;

    public PracticeFormObject (Map<String, String> testData) {
        prepareObject(testData);
    }


    private void prepareObject(Map<String, String> testData) {

        for (String key : testData.keySet()) {
            switch (key) {
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
                case "mobileNumValue":
                    setMobileNumValue(testData.get(key));
                    break;
                case "monthDateOfBirthValue":
                    setMonthDateOfBirthValue(testData.get(key));
                    break;
                case "yearOfBirthValue":
                    setYearOfBirthValue(testData.get(key));
                    break;
                case "dobDayvalue":
                    setDobDayvalue(testData.get(key));
                    break;
                case "genderValue":
                    setGenderValue(testData.get(key));
                    break;
                case "subjectValue":
                    setSubjectValue(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "addressFieldValue":
                    setAddressFieldValue(testData.get(key));
                    break;
                case "stateInputValue":
                    setStateInputValue(testData.get(key));
                    break;
                case "cityValue":
                    setCityValue(testData.get(key));
                    break;
                case "hobbies":
                    hobbies = getPreparedValue(testData.get(key));
                    break;
            }
        }
    }



    public String getFirstNameValue() {
        return firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public String getMobileNumValue() {
        return mobileNumValue;
    }

    public String getMonthDateOfBirthValue() {
        return monthDateOfBirthValue;
    }

    public String getYearOfBirthValue() {
        return yearOfBirthValue;
    }

    public String getDobDayvalue() {
        return dobDayvalue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public String getSubjectValue() {
        return subjectValue;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getAddressFieldValue() {
        return addressFieldValue;
    }

    public String getStateInputValue() {
        return stateInputValue;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public void setMobileNumValue(String mobileNumValue) {
        this.mobileNumValue = mobileNumValue;
    }

    public void setMonthDateOfBirthValue(String monthDateOfBirthValue) {
        this.monthDateOfBirthValue = monthDateOfBirthValue;
    }

    public void setYearOfBirthValue(String yearOfBirthValue) {
        this.yearOfBirthValue = yearOfBirthValue;
    }

    public void setDobDayvalue(String dobDayvalue) {
        this.dobDayvalue = dobDayvalue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public void setHobbies(List<String> hobbies) {
        hobbies = hobbies;
    }

    public void setSubjectValue(String subjectValue) {
        this.subjectValue = subjectValue;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setAddressFieldValue(String addressFieldValue) {
        this.addressFieldValue = addressFieldValue;
    }

    public void setStateInputValue(String stateInputValue) {
        this.stateInputValue = stateInputValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }
}

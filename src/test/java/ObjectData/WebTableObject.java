package ObjectData;

import java.util.Map;

public class WebTableObject {

    private String firstnameValue;
    private String lastNameValue;
    private String emailAddr;
    private String ageValue;
    private String  salaryValue;
    private String departmentValue;

    //facem o metoda care sa mapeze datele din fisierul de resurse cu reprezentarea acestui obiect

    public WebTableObject (Map<String, String> testData){
        prepareObject(testData);

    }

    private void prepareObject(Map<String, String> testData) {

        for (String key : testData.keySet()) {
            switch (key) {
                case "firstnameValue":
                    setFirstnameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "emailAddr":
                    setEmailAddr(testData.get(key));
                    break;
                case "ageValue":
                    setAgeValue(testData.get(key));
                    break;
                case "salaryValue":
                    setSalaryValue(testData.get(key));
                    break;
                case "departmentValue":
                    setDepartmentValue(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstnameValue() {
        return firstnameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public String getDepartmentValue() {
        return departmentValue;
    }

    public void setFirstnameValue(String firstnameValue) {
        this.firstnameValue = firstnameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public void setDepartmentValue(String departmentValue) {
        this.departmentValue = departmentValue;
    }

}

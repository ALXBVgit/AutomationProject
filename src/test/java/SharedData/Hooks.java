package SharedData;

import LoggerUtility.LoggerUtiliyy;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{

    private String testName;

    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        LoggerUtiliyy.startTestCase(testName);
        prepareDriver();
        LoggerUtiliyy.infotest("Driver was open with success");

    }

    @AfterMethod
    public void clearEnvironment(){
        clearDriver();
        LoggerUtiliyy.infotest("Driver was closed with success");
        LoggerUtiliyy.finishTestCase(testName);
    }
}

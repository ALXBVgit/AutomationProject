package loggerUtility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtiliyy {

    //in aceasta clasa configuram metode pentru a loga informatii
    //ne trebuie o metoda care sa reprezinte inceputul unui test, finalul unui test, info, error

    private static Logger logger = LogManager.getLogger();
    public static void startTestCase(String testCase){
        logger.info("****** Execution Started: " + testCase + " ******");
    }

    public static void finishTestCase(String testCase){
        logger.info("****** Execution Finished: "+testCase+" ******");
    }

    public static void infotest(String message){
        logger.info(message);
    }

    public static void errorTest(String message){
        logger.error(message);
    }
}

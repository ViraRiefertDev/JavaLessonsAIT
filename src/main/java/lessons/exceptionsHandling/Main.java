package lessons.exceptionsHandling;

import exceptions.WrongAgeValueException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        CheckUserAge checkUserAge = new CheckUserAge();
        int age = 160;
        try {
            checkUserAge.checkAge(age);
        }
        catch(WrongAgeValueException exception){
            LOGGER.error(exception.getMessage());

        }

        checkUserAge.checkHumanAge(300);

    }
}

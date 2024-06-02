package homework.homework37;

import lessons.exceptionsHandling.CheckedExceptionMuster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberChecker {

    /*
        Задание:
        Выбрасывание непроверяемого исключения при некорректном входном значении
        Описание
        Напишите метод, который проверяет, является ли строка числом, и выбрасывает NumberFormatException, если строка не может быть преобразована в число.
        Задачи
        Создайте класс NumberChecker.
        Напишите метод checkNumber, который принимает строку и выбрасывает NumberFormatException, если строка не является числом.
        В методе main вызовите checkNumber и обработайте исключение с помощью блока try-catch.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(NumberChecker.class);

    public boolean checkNumber(String stringToCheck) throws NumberFormatException{
       LOGGER.info("String to Check if is a number {}", stringToCheck);
       stringToCheck =stringToCheck.trim();
       for(int i=0; i<stringToCheck.length();i++){
           if(!Character.isDigit(stringToCheck.charAt(i))){
               LOGGER.error("Character {} is not a digit, {}",stringToCheck.charAt(i),stringToCheck);
               throw new NumberFormatException("This string cannot be converted to number!");
           }
       }
       LOGGER.info("This string can be converted to number!!");
     return true;
    }
}

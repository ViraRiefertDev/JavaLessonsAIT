package homework.homework37;

import exceptions.InvalidStringLengthException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/*
        Задание:
        Проброс исключения через несколько методов
        Напишите программу, где одно исключение пробрасывается через несколько методов и обрабатывается в методе main.
        Задачи
        Создайте класс ExceptionPropagation.
        Напишите метод method1, который вызывает method2.
        Напишите метод method2, который вызывает method3.
        Напишите метод method3, который выбрасывает IOException.
        Объявите throws IOException в сигнатуре методов method1, method2, method3.
        В методе main вызовите method1 и обработайте исключение с помощью блока try-catch.
 */

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        try {
            numberChecker.checkNumber("123");
        }
        catch (NumberFormatException exception){
            LOGGER.error(exception.getMessage());
        }

        StringValidator validator = new StringValidator();
        try {
            validator.validateStringLength("ffg");
        }
        catch (InvalidStringLengthException exception){
            LOGGER.error(exception.getMessage());
        }
        finally {
            LOGGER.info("The program has completed its work");
        }


        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        try {
            exceptionPropagation.method1();
        }
        catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }
    }
}

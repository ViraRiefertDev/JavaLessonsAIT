package homework.homework36;

import lessons.exceptionsHandling.ErrorCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrinksAutomat {
    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorCalculator.class);
    static String[] drinks = new String[]{"Сок", "Кофе", "Чай"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LOGGER.info("Пришел клиент");
        LOGGER.info("\nВведите номер напитка\n1 - Сок\n2 - Кофе\n3 - Чай");
        try {
            int number = scanner.nextInt();
            LOGGER.info("Напиток {} готовится", drinks[number-1]);

        } catch (InputMismatchException exception) {
            LOGGER.error("Ввели нецелое число или буквы!");
            LOGGER.error(exception.getLocalizedMessage());
        }
        catch (ArrayIndexOutOfBoundsException exception){
            LOGGER.error("Номер выходит за пределы массива");
            LOGGER.error(exception.getLocalizedMessage());
        }
        finally {
        LOGGER.info("Программа завершена!");
        }

    }

}

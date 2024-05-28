package homework.homework36;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class DrinksAutomat {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrinksAutomat.class);
    private static String[] drinks = new String[]{"Сок", "Кофе", "Чай"};
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LOGGER.info("Пришел клиент");
        LOGGER.info("\nВведите номер напитка\n1 - Сок\n2 - Кофе\n3 - Чай");
        int number =0;
        try {
            number = Integer.parseInt(scanner.nextLine()) ;
            String drink = drinks[number-1];
            LOGGER.info("Напиток {} готовится", drink);

        } catch (NumberFormatException exception ) {
            LOGGER.error("Неверный формат ввода напитка Excetion:{}",exception.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException exception){
            LOGGER.error("Номер выходит за пределы массива, неправильный номер напитка");
            LOGGER.error(exception.getLocalizedMessage());
        }
        finally {
        LOGGER.info("Программа завершена!");
        }

    }

}

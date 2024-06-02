package homework.homework37;

import exceptions.InvalidStringLengthException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringValidator {

    /*
        Задание:
        Создание и выбрасывание собственного исключения
        Описание
        Напишите метод, который проверяет длину строки и выбрасывает собственное исключение, если длина строки меньше 5 символов.
        Задачи
        Создайте класс InvalidStringLengthException, расширяющий Exception.
        Создайте класс StringValidator.
        Напишите метод validateStringLength, который принимает строку и выбрасывает InvalidStringLengthException, если длина строки меньше 5 символов.
        В методе main вызовите validateStringLength и обработайте исключение с помощью блока try-catch.
        Ожидаемый результат
        При вводе корректного номера: сообщение о приготовлении выбранного напитка.
        При вводе некорректного номера или нецелого числа: соответствующее сообщение об ошибке.
        В любом случае сообщение о завершении программы в блоке finally.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(StringValidator.class);

    public boolean validateStringLength (String stringToValidate) throws InvalidStringLengthException{
        LOGGER.info("String to validate {}", stringToValidate);
        if(stringToValidate.length()<5){
            throw new InvalidStringLengthException("This String is < 5 Characters");
        }
        LOGGER.info("String is valid {}", stringToValidate);
        return true;
    }
}

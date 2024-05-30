package lessons.exceptionsHandling;

/*
Обработка непроверяемого исключения
Напишите программу, которая пытается получить доступ к элементу массива с недопустимым индексом и обрабатывает исключение.
**Задание:**
1. Создайте класс `ArrayAccessExample`.
2. В методе `main` напишите код, который пытается получить доступ к 10-му элементу массива из трех элементов.
3. Обработайте `ArrayIndexOutOfBoundsException` с помощью блока `try-catch`.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
    /*
    Обработка непроверяемого исключения
    Напишите программу, которая пытается получить доступ к элементу массива с недопустимым индексом и обрабатывает исключение.
    **Задание:**
    1. Создайте класс `ArrayAccessExample`.
    2. В методе `main` напишите код, который пытается получить доступ к 10-му элементу массива из трех элементов.
    3. Обработайте `ArrayIndexOutOfBoundsException` с помощью блока `try-catch`.
     */
public class ArrayAccessExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayAccessExample.class);
    public static void main(String[] args) {
        int[] arrayInt = {12,10,2};
        int result = -1;
        int index = 10;
        try{
            LOGGER.info("Получаем элемент по индексу {}",index);
            result = arrayInt[index];
        }
        catch(IndexOutOfBoundsException exception){
            LOGGER.error(exception.getMessage());
        }
        finally {
            LOGGER.info("Результат работы программы: {}", result);
            LOGGER.info("Работа программы завершена!");

        }
    }

}

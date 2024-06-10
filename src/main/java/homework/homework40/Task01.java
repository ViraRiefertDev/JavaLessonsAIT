package homework.homework40;

import lessons.lesson10.CalculatorHW;
import lessons.lesson40.JavaIOMusterSkipBites;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class Task01 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Task01.class);

    public static void main(String[] args) {
        /*
        Задание 1: Чтение файла и подсчёт символов
        Цель задания: Написать программу на Java, которая использует FileInputStream для чтения текстового файла и подсчитывает количество вхождений каждого символа.

        Описание задания:

        1. Создайте текстовый файл с некоторым содержимым. Например, файл может содержать простой текст, такой как стихотворение или короткую статью.
        2. Напишите программу, используя FileInputStream, которая открывает этот файл, читает его содержимое по одному символу за раз и подсчитывает, сколько раз каждый символ встречается в тексте.
        3. Выведите результаты в консоль в формате: символ и количество его вхождений.
        4. Обработайте возможные исключения, такие как FileNotFoundException и IOException.
         */
        InputStream inputStream = null;
        HashMap<Character,Integer> statisticsByLetter = null;
        try{
            inputStream = new FileInputStream("src/main/resources/To_be_or_not_to_be");
            int data;
            statisticsByLetter = new HashMap<>();

            while((data = inputStream.read()) != -1){
                if(statisticsByLetter.containsKey((char)data)){
                    statisticsByLetter.put((char)data, statisticsByLetter.get((char)data)+1);
                }
                else{
                    statisticsByLetter.put((char)data, 1);
                }
            }
        }catch (FileNotFoundException exception){
            LOGGER.error("File not found!", exception.getMessage());
        }catch (IOException exception){
            LOGGER.error("I/O Exception", exception.getMessage());
        }
        finally {
            try{
                inputStream.close();
                LOGGER.info("Input Stream was successfully closed");
            }catch (IOException exception){
                LOGGER.error(exception.getMessage());
            }
        }
        statisticsByLetter.forEach((key,value) -> System.out.println(key + ": " + value));

    }
}

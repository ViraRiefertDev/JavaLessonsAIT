package lessons.lesson41;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
    /*
    Напишите программу, которая считывает содержимое файла input.txt и записывает его в файл output.txt с
    использованием байтовых потоков (FileInputStream и FileOutputStream).
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Task1.class);
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("src/main/resources/input.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output.txt")){
            int data;
            while((data = fileInputStream.read()) !=-1){
                fileOutputStream.write(data);
            }


        }catch(FileNotFoundException exception){
            LOGGER.error(exception.getMessage());
        }catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }
    }
}

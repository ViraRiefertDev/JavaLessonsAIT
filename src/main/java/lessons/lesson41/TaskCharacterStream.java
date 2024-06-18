package lessons.lesson41;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskCharacterStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskCharacterStream.class);
    /*
    Напишите программу, которая считывает содержимое текстового файла input.txt и записывает его в файл output.txt
    с использованием символьных потоков (FileReader и FileWriter).
     */
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("src/main/resources/input.txt");
            FileWriter fileWriter = new FileWriter("src/main/resources/output.txt")){
            int data;
            while((data = fileReader.read()) != -1){
                fileWriter.write(data);
            }

        }catch(FileNotFoundException exception){
            LOGGER.error(exception.getMessage());
        }
        catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }
    }
}

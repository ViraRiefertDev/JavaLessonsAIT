package lessons.lesson40;

import lessons.lesson38.homework38.BankAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOMuster {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOMuster.class);

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("passwords.txt");
            int data;
            //read читает байты с потока, если достигнут конец потока возвращает -1 и мы выходим из цикла
            //считывает по.буквенно
            while((data = inputStream.read()) != -1) {
                System.out.print((char)data);
                //LOGGER.info(new String(Character.toChars(data)));
            }
        }catch (FileNotFoundException exception){
            LOGGER.error("File not found",exception.getMessage());
        }catch (IOException exception){
            LOGGER.error("I/O Error",exception.getMessage());
        }
        //Закрываем ресурс
        finally {
            try {
                inputStream.close();
            }catch (IOException exception){
                LOGGER.error(exception.getMessage());
            }
        }

    }
}

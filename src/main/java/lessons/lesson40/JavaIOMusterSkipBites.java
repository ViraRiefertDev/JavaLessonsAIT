package lessons.lesson40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIOMusterSkipBites {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOMusterSkipBites.class);

    public static void main(String[] args) {
        try(InputStream inputStream = new FileInputStream("passwords.txt")) {

            //пропускаем первые 5 байтов
            inputStream.skip(5);
            int data;
            while((data = inputStream.read()) != -1){
                System.out.print((char) data);
            }

        }catch (FileNotFoundException exception){
            LOGGER.error(exception.getMessage());
        }catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }


    }
}

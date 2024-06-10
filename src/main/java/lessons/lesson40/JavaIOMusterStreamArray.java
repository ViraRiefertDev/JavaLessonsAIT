package lessons.lesson40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOMusterStreamArray {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOMusterStreamArray.class);

    public static void main(String[] args) {
        //Закрытие поток можно не делая в finally а в try(): try c ресурсами
        try(InputStream inputStream = new FileInputStream("passwords.txt")) {
            byte[] data = new byte[1024];
            int bytesRead;
            //считывает одним прыжком
            while((bytesRead = inputStream.read(data)) != -1){
                String text = new String(data,0,bytesRead);
                System.out.println(text);
            }
        }catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }

    }
}

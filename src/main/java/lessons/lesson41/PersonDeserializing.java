package lessons.lesson41;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeserializing {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonDeserializing.class);

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/person.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Person personJeckieChan = (Person) objectInputStream.readObject();
            LOGGER.info("personJeckieChan: {}", personJeckieChan);

        }catch (ClassNotFoundException exception) {
            LOGGER.error(exception.getMessage());
        }
         catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}

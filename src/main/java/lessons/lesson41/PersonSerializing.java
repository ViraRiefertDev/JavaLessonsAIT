package lessons.lesson41;

import lessons.lesson40.JavaIOMuster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerializing {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonSerializing.class);

    public static void main(String[] args) {
        Person person = new Person("Jackie Chan",70,"123");
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
            LOGGER.info("Person serialized successfully");
        }
        catch (FileNotFoundException exception){
            LOGGER.error(exception.getMessage());

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }

    }
}

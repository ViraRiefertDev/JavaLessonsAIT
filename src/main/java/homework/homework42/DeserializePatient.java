package homework.homework42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializePatient {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeserializePatient.class);
    private static final String FILE_PATH = "src/main/resources/patients.txt";
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))){
            List<Patient> patients =(ArrayList<Patient>) objectInputStream.readObject();
            patients.forEach(System.out::println);

        }
        catch (ClassNotFoundException | IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}

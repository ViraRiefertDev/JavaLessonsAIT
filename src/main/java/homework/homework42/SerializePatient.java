package homework.homework42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerializePatient {
    private static final Logger LOGGER = LoggerFactory.getLogger(SerializePatient.class);
    private static final String FILE_PATH = "src/main/resources/patients.txt";

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        Patient patientOne = new Patient("Иванов Иван", 40, "гастрит", LocalDate.of(2024, 05, 20));
        Patient patientTwo = new Patient("Петров Петр", 30, "перелом", LocalDate.of(2024, 04, 10));

        patients.add(patientOne);
        patients.add(patientTwo);

        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)) {
                objectOutputStream.writeObject(patients);

        } catch (
                FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());

        } catch (
                IOException exception) {
            LOGGER.error(exception.getMessage());
        }
    }
}

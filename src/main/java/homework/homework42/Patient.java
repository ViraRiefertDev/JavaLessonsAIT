package homework.homework42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.time.LocalDate;

public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String diagnose;
    private LocalDate lastVisit;

    public Patient(String name, int age, String diagnose, LocalDate lastVisit) {
        this.name = name;
        this.age = age;
        this.diagnose = diagnose;
        this.lastVisit = lastVisit;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", diagnose='" + diagnose + '\'' +
                ", lastVisit=" + lastVisit +
                '}';
    }
}

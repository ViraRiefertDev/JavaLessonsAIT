package consultation.faker;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerUtil {
    public static void main(String[] args) {
        for(int i=0; i<400;i++){
            createFakeStudent();
        }
    }

    public static Student createFakeStudent(){
        Faker faker = new Faker(new Locale("de-De"));
        String firstName = faker.name().firstName();
        String secondName = faker.name().lastName();
        String address = faker.address().fullAddress();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        Student studentOne = new Student(firstName, secondName, address, phoneNumber);

        System.out.println(faker.job().field());
        System.out.println(studentOne.toString());

        return studentOne;
    }
}
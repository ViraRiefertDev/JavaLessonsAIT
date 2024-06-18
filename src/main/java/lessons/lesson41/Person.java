package lessons.lesson41;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long seralVersionUID = 2L;

    private String name;
    private int age;
    private transient String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}

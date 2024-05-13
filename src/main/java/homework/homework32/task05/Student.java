package homework.homework32.task05;

import java.util.Objects;

public class Student {
    private int identificator;
    private String name;
    private int grade;

    public Student(String name, int grade,int identificator) {
        this.name = name;
        this.grade = grade;
        this.identificator = identificator;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return identificator == student.identificator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificator);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

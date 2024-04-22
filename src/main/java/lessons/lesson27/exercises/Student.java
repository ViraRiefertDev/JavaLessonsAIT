package lessons.lesson27.exercises;

public class Student extends Person{
    private String educationTime;
    private double avarageDegree;

    public Student(String name, int age, String educationTime, double avarageDegree) {
        super(name, age);
        this.educationTime = educationTime;
        this.avarageDegree = avarageDegree;
    }

    //это аннотация называется
    @Override
    public String toString() {
        return "Student{" +
                "educationTime='" + educationTime + '\'' +
                ", avarageDegree=" + avarageDegree +
                '}';
    }

    public String getEducationTime() {
        return educationTime;
    }

    public double getAvarageDegree() {
        return avarageDegree;
    }
}

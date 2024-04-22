package lessons.lesson27.exercises;

public class Teacher extends Person{
    private String subject;
    private int experience;

    public Teacher(String name, int age, String subject, int experience) {
        super(name, age);
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", experience=" + experience +
                "} " + super.toString();
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }
}

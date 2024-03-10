package consultation.faker;

public class Student {
    private String firstName;
    private String secondName;
    private String address;
    private String phonenumber;

    public Student(String firstName, String secondName, String address, String phonenumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    //генерируется , когда надо вывести все данные на экран
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}

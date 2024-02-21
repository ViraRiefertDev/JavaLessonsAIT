package lesson11;

public class Person {
    private int age = 20;
    private String name = "Max";

    private String pass = "Deutschland";

    private String colorOfEyes = "black";
    private String sex = "male";

    //Для такой sensible переменных не существует метода геттера
    private String pincode = "12345";

    //Можно автоматически генерировать геттеры для всех переменных пкм -> Generate -> Getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public String getSex() {
        return sex;
    }

    public static void main(String[] args) {

    }



}

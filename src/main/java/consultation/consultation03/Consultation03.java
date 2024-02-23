package consultation.consultation03;
import java.util.Scanner;
public class Consultation03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите имя: ");
        String name = scanner.next();
        String text = null;
        if(age < 16){
            System.out.println(name + ", вы несовершеннолетний(/яя)");
        }
        else {
            System.out.println(name + ", вы совершеннолетний(/яя)");
        }
        scanner.close();

    }
}

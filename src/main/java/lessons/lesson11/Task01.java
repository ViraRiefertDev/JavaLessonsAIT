package lessons.lesson11;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Вашу предположение (1-100)");
        while (!scanner.hasNextInt()){ //hasNaxtInt блокирует scanner.next(); если мы ввели ?не? правильное значение
            System.out.println("Ошибка, введите число");
            scanner.next();
        }
        int number = scanner.nextInt();

        System.out.println("-------------------");
        scanner.next();
        number = scanner.nextInt();
    }
}

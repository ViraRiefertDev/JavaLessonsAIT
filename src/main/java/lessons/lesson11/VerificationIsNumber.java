package lessons.lesson11;
import java.util.Scanner;
public class VerificationIsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numb = " ";
        while (!scanner.hasNextInt()){
            System.out.println("Ошибка, введите число");
            numb = scanner.next();
        }
        int number = scanner.nextInt();
        System.out.println(numb);
        System.out.println(number);
    }
}


package lessons.lesson06;

import java.util.Scanner;

public class task2 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Вы ввели " + number);
        scanner.close();
    }
}

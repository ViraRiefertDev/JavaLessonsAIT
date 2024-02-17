package lesson09;
/*
Создайте программу, которая использует цикл 'while'
для чтения неопределенного количества чисел с консоли
(процесс останавливается, когда введено отрицательное число)
и находит наибольшее и наименьшее из ввведенных чисел.
 */
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, чтоб остановить программу введите отрицательное число");
        int number = scanner.nextInt();
        if (number >= 0) {
            int min = number;
            int max = number;

            while (number >= 0) {

                if (number > max) {
                    max = number;
                } else if (number < min && number>0) {
                    min = number;
                }
                
                number = scanner.nextInt();

            }
            System.out.println("Максимальное введенное число = " + max);
            System.out.println("Минимальное введенное число  = " + min);
        }
            System.out.println("Вы ввели отрицательное число, программа завершена");


    }

}

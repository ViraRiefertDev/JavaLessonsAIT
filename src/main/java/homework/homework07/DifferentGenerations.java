package homework.homework07;

import java.util.Scanner;

public class DifferentGenerations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        byte age = scanner.nextByte();
        scanner.close();
        if (age < 0 || age > 120)
            System.out.println("Вы ввели не правильный возраст! Попробуйте еще!");
        else {
            if (age < 15) {
                System.out.println("Вы принадлежите к поколению альфа!");
            }
            else if (age < 27) {
                System.out.println("Вы принадлежите к поколению зуммеров!");
            }
            else if (age < 44) {
                System.out.println("Вы принадлежите к поколению миллениалов!");
            }
            else if (age < 60) {
                System.out.println("Вы принадлежите к X поколению!");
            }
            else if(age <90) {
                System.out.println("Вы принадлежите к поколению буммеров");
            }
            else {
                System.out.println("Вы принадлежите к тихому поколению");
            }

        }

    }

}

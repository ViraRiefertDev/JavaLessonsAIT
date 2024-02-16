package Homework.Homework07;

import java.util.Scanner;

public class DiffAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        byte age = scanner.nextByte();
        scanner.close();
        if (age < 0 || age > 120)
          System.out.println("Вы ввели не правильный возраст! Попробуйте еще!");
        else if (age < 13) {
            System.out.println("Вы ребенок");
        } else if (age < 19) {
            System.out.println("Вы подросток");
        } else if (age < 65) {
            System.out.println("Вы взрослый");
        } else {
            System.out.println("Вы преклонного возраста");
        }

    }

}





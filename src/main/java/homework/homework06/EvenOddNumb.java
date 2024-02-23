package homework.homework06;

import java.util.Scanner;

public class EvenOddNumb {
    public static void main(String[] args) {
        //Проверка Чётных и Нечётных Чисел: Напишите программу, которая запрашивает у пользователя целое число и
        // сообщает, является ли это число чётным или нечётным.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scan.nextInt();
        scan.close();

        //первый вариант
        if(number%2==0)
            System.out.println("Ваше число является четным!");
        else
            System.out.println("Ваше число является нечетным!");

        //Второй вариант
        if((number & 0b00000001) == 0)
            System.out.println("Ваше число является четным!");
        else
            System.out.println("Ваше число является нечетным!");

        //Третий вариант если использовать только то, что мы изучали
        int numberCheck = number/ 2 *2;
        if(number == numberCheck)
            System.out.println("Ваше число является четным!");
        else
            System.out.println("Ваше число является нечетным!");

    }

}

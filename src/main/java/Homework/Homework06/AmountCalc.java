package Homework.Homework06;
import java.util.Scanner;

public class AmountCalc {
    //Калькулятор Суммы: Напишите программу, которая запрашивает у пользователя два числа и выводит их сумму.
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите 2 числа");
        System.out.print("Первое число: ");
        double num1 = scan.nextDouble();
        System.out.print("Второе число: ");
        double num2 = scan.nextDouble();
        scan.close();
        double sum = num1+num2;
        System.out.println("Сумма двух чисел " + num1 + " + " + num2 + " = " + sum);
    }

}

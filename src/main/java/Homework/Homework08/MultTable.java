package Homework.Homework08;
import java.util.Scanner;
public class MultTable {
    public static void main(String[] args) {
        //Пользователи вводит число, напечатать табличку умножения для этого числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for(int i = 1; i<=10;i++){
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}

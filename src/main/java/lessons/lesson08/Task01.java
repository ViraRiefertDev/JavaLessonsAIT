package lessons.lesson08;
import java.io.PrintStream;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        System.out.println(number % 2 == 0 ? "Четное" : "Нечетное");
        System.out.println(number % 1 == 0 ? "Целое" : "Нецелое");
    //Перед знаком : и перед ? можно перенести строчку
        System.out.println(number>0 ? "Положительное"
                : (number<0 ? "Отрицательное" : "Ноль"));

        System.out.println(number%1==0 && number>=0 && number<=9 ? "Цифра" : "Число");
    }
    //рекурсия
    //итераторы
    // for-each


}

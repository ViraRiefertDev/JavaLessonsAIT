package Homework.Homework08;
import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        //Пользователь вводит число, посчитать сумму всех натуральных чисел,
        // которые идут до него включительно.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum = 0;
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
            sum +=i;
        }
        System.out.println(sum);
    }
}

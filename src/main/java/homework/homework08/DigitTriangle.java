package homework.homework08;

import java.util.Scanner;

public class DigitTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту треугольника: ");
        int n = scanner.nextInt();
        String up = "";
        String down = "";
        String temp = "";
        for (int i = 1; i <= n; i++) {
            temp += i;
            up += temp + "\n";
            if (i != n) {
                down = temp + "\n" + down;
            }
        }
        System.out.println(up + down);
    }

}


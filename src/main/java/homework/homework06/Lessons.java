package homework.homework06;

import java.util.Scanner;

public class Lessons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сколько сейчас часов (00-23) ");
        int hours = scan.nextInt();
        System.out.print("Введите сколько сейчас минут(00-59):");
        int minutes = scan.nextInt();
        scan.close();
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
            if (hours == 12 && minutes == 45) {
                System.out.println("Последний урок закончился, началось свободное время");
            } else if (hours == 13 && minutes == 0) {
                System.out.println("Свободное время закончилось, начался обед");
            }
            //Время обеда
            else if (hours == 13 && minutes < 30) {
                System.out.println("Идет обед");
            } else if (hours == 13 &&  minutes==30) {
                System.out.println("Обед закончился, началось свободное время. Можно идти домой");
            }
            //Учебное время
            else if (hours >= 8 && hours < 12 || hours == 12 && minutes < 45) {
                if (minutes < 45 && minutes > 0)
                    System.out.println("Идет урок");
                else if (minutes == 0 && hours != 8) {
                    System.out.println("Перемена закончилась, начался урок");
                } else if (minutes == 0)
                    System.out.println("Cвободное время закончилось, начался первый  урок");

                else if (minutes > 45)
                    System.out.println("Сейчас перемена");
                else {
                    System.out.println("Урок закончился, началась перемена");
                }

            } else
                System.out.println("Cвободное время");
        } else
            System.out.println("Вы ввели неправильно время!");
    }
}

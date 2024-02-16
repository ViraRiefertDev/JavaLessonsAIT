package Homework.Homework07;

import java.util.Scanner;

public class KnowledgeTesting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer1, answer3;
        char answer2;
        byte rightAnswer=0;



        System.out.println("Question №1:");
        System.out.println("Класс Scaner отвечает за получение информации от пользователя (yes/no)");
        answer1 = scanner.next();
        if (answer1.equals("no")) {
            System.out.println("Это правильный ответ! Это Scanner");
            rightAnswer++;
        }

        else if (answer1.equals("yes")) {
            System.out.println("ERROR! \n Класс отвечающий за получение информации называется Scanner! \n Внимательность очень важна для программиста!");
        }
        else {
            System.out.println("Вы ввели что-то другое! Надо ввести yes/no");
        }
        System.out.println("------------------------------------------------------------------------");


        System.out.println("Question №2:");
        System.out.println("Где правильно создана простая переменная?");
        System.out.println("a) byte x = 1000; \nb) char str = 'ab'; \nc) float x = 23.3f;");
        answer2 = scanner.next().charAt(0);
        if (answer2 == 'a') {
                System.out.println("ERROR! \n Тип данных byte находится в диапазоне от -128 до 127");
            }
         else if (answer2 == 'b') {
                System.out.println("ERROR! \n Тип данных char может содержать только один символ");
            }
         else if (answer2 == 'c') {
                System.out.println("Это правильный ответ!");
                rightAnswer++;
            }
         else {
                System.out.println("Вы ввели чтото другое! Надо ввести a b или c");
        }
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Question №3: ");
        System.out.println("Что выведет этот код?");
        System.out.println("for(int i=10; i<20; i+=2){\n\tif(i>15)\n\t\tbreak;\n\tif(i%4==0)\n\t\tcontinue;\n\tSystem.out.print(i + \" \");\n}");
        answer3 = scanner.nextLine();
        answer3 = scanner.nextLine();
        scanner.close();
        if (answer3.equals("10 14")) {
            System.out.println("Это правильный ответ!");
            rightAnswer++;
        }
        else {
            System.out.println("ERROR! Программа выведет: 10 14");
        }
        if(rightAnswer>1){
            System.out.println("Вы хорошо знаете программирование!");
        }
        else{
            System.out.println("Вам нужно учиться больше!");
        }


    }
}

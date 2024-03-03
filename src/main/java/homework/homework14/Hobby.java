package homework.homework14;

import java.util.Arrays;
import java.util.Scanner;

public class Hobby {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] hobby = {"велосипед", "рисование", "программирование", "плаванье", "вязание", "рыбалка"};
        int[] ratings = {4,3,1,2,6,5};

        //Задание 1
        printTask(1);
        print(hobby);

        //Задание 2
        printTask(2);
        boolean isHobby = arraySearch(hobby);
        print(isHobby);


        //Задание 3
        printTask(3);
        String favHobby = favoriteHobby(hobby);
        print("Ваше любимое хобби: " + favHobby);

        //Задание 4
        printTask(4);
        hobby = addNewArrayElement(hobby);
        ratings = addNewArrayElement(ratings);
        print(hobby);

        //Задача 5
        printTask(5);
        print(hobby,ratings);
    }



    public static void printTask(int numberOfTask) {
        System.out.println("-------------------------------Задание " + numberOfTask + "----------------------------------");
    }

    public static void print(String str) {
        System.out.println(str);
    }
    public static void print(int numberOfSpaces) {
        for(int i=0; i<=numberOfSpaces;i++){
            System.out.print(" ");
        }
    }

    public static void print(boolean isHobby){
        if (isHobby) {
            print("Заданное хобби есть в списке.");
        } else {
            print("Такого хобби в списке нет.");
        }
    }

    public static void checkValue(int number) {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число от 1 до " + number + "!");
            scanner.next();
        }
    }
    public static void checkValue() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.next();
        }
    }

    public static int selectionFromList(int number){
        while (true) {
            checkValue(number);
            int numberOfSelection = scanner.nextInt();
            if (numberOfSelection > 0 && numberOfSelection <= number) {
                return numberOfSelection;
            }
            System.out.println("Введите число от 1 до " + number + "!");
        }
    }

    public static int longestWordLength(String[] hobby){
        int maxLength = 0;
        for (String word : hobby) {
            if (maxLength < word.length()) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }

    /*
    Задача 1: Список хобби
    Задание: Создайте массив строк, который содержит список хобби (например, "рисование",
    "программирование", "велоспорт"). Выведите все хобби из массива на экран.
    Цель: Практика создания массивов и итерации по элементам массива.
     */
    public static void print(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    /*
    Задача 2: Поиск хобби
    Задание: Дан массив хобби (как в задаче 1). Напишите программу, которая ищет в массиве
    заданное хобби и выводит на экран сообщение о том, есть ли оно в списке.
    Цель: Практика поиска элементов в массиве.
     */
    public static boolean arraySearch(String[] array) {
        boolean isHobby = false;
        print ("Какое хобби Вы хотите найти?");
        String word = scanner.next().trim().toLowerCase();
        for (String s : array) {
            if (word.equals(s)) {
                isHobby = true;
                break;
            }
        }
        return isHobby;
    }

    /*
    Задача 3: Любимое хобби
    Задание: Используя массив хобби (как в задаче 1), попросите пользователя ввести номер
    своего любимого хобби из списка. Выведите на экран название выбранного хобби.
    Цель: Практика работы с пользовательским вводом и доступом к элементам массива.
     */
    public static String favoriteHobby(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ") " + array[i]);
        }
        print ("Введите номер любимого хобби из списка (1-6)");
        int numberOfHobby = selectionFromList(array.length);
        return array[numberOfHobby - 1];

    }

    /*
    Задача 4: Добавление хобби
    Задание: Напишите программу, которая позволяет добавить новое хобби в существующий массив хобби.
    Поскольку размер массива в Java фиксирован, вам нужно будет создать новый массив большего размера
    и скопировать в него элементы из старого массива, добавив новое хобби.
    Цель: Практика работы с массивами и управления размером массива.
     */

    public static String[] addNewArrayElement(String[] hobby){
        String[] newHobby = new String[hobby.length+1];
        System.arraycopy(hobby,0,newHobby,0,hobby.length);
        System.out.println("Введите еще одно хобби");

        newHobby[newHobby.length-1] = scanner.next().trim().toLowerCase();
        return newHobby;
    }

    public static int[] addNewArrayElement(int[] ratings){
        int[] newRatings= new int[ratings.length+1];
        System.arraycopy(ratings,0,newRatings,0,ratings.length);
        System.out.println("Введите рейтинг для этого хобби");
        checkValue();
        newRatings[newRatings.length-1] = scanner.nextInt();
        for(int i = 0; i<newRatings.length-1;i++){
            if(newRatings[i]>=newRatings[newRatings.length-1]){
                newRatings[i] ++;
            }
        }
        return newRatings;
    }

    /*
    Задача 5: Рейтинг хобби
    Задание: Создайте два массива: один для хобби (как в задаче 1) и один для рейтинга каждого хобби
    (целые числа). Напишите программу, которая выводит хобби и их рейтинги в виде списка.
    Цель: Практика работы с параллельными массивами для управления связанными данными.
     */
    public static void print(String[] hobby, int[] ratings){
        int maxWordLength = longestWordLength(hobby) + 2;
        System.out.print("Хобби");
        print(maxWordLength-5);
        print("Рейтинг");
        for(int i=0; i<hobby.length;i++){
            System.out.print(hobby[i]);
            print(maxWordLength-hobby[i].length());
            System.out.println(ratings[i]);
        }
    }
}

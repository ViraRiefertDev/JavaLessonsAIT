package lesson12;

import java.util.Scanner;

public class PracticeMethods {
    /*
    Создайте метод 'isEven', который принимает один целочисленный аргумент
    и возвращает 'boolean' значение, которое указывает, является ли число четным.
    В 'main', проверьте несколько чисел и выведите результаты проверки.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введить число, а мы скажем четное оно или не четное: ");
        while (!scanner.hasNextInt()){
            System.out.println("Вы ввели не то значение");
            scanner.next();
        }
        int numb =scanner.nextInt();

        boolean isNumbEven = isEven(numb);
        if(isNumbEven){
            System.out.println("Число четное");
        }else{
        System.out.println("Число не четное");}

        //Високостный год
        System.out.print("Введите год, а мы скажем високостный он или нет: ");
        while (!scanner.hasNextInt()){
            System.out.println("Вы ввели не то значение");
            scanner.next();
        }
        int year = scanner.nextInt();
        boolean isYearLeap = isLeapYear(year);
        if(isYearLeap){
            System.out.println("Год високостный");
        }else{
            System.out.println("Год не високостный");}

        System.out.println("Введите слово, а мы проверим полиндром ли оно");
        String word = scanner.next();

        boolean isPoli = isPolindrom(word);

        if(isPoli){
            System.out.println("Слово является полиндромом");
        }else{
            System.out.println("Слово не является полиндромом");}





    }
    //метод проверяет является ли число четным
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    //метод проверяет является ли год високостным
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }


    //является ли слово полиндромом
    public static boolean isPolindrom(String word){
        boolean isPoli = true;
        char[] charWord = word.toCharArray();
        int halfLength =word.length();
        for (int i = 0; i<halfLength; i++){
            if(charWord[i]!=(charWord[charWord.length-i-1])){
                isPoli = false;
                break;
            }
        }
        return isPoli;
    }


}

package lesson03;


public class Variables {

    //-128 до 127 1байт
    static byte age = 127;

    //-32768 до 32767 2байта
    static short preis = 10000;

    //-2147483648 до 2147483647 4байта
    static int number = 500;

    //-9223372036854775808 до 9223372036854775807 8байт
    static long bigNumberPeople = 34343434343343343L;

    //дробные числа, с плавающей точкой
    static float euroPreis = 0.85f;

    //дробные числа, с плавающей точкой
    static double dollarPreis = 0.855;

    //символы
    static char charLetter = 'A';

    //логические (да или нет)
    static boolean result=true;

    //текст
    static String text = "Hello";


    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(result);

        //Строчный тип (по факту массив симолов char[])
        String text = "Hello World";

        System.out.println("Возраст " + age + "\nКурс валюты евро/доллар " + euroPreis);
        System.out.println("dfdf"+ true + 35);
    }
}


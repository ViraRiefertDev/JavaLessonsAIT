package lesson04;

public class Task01 {
    /*
   Напишите программу, которая объявляет три переменные типа float
   и присваивает им значения. Программа должна вычислить и выводить
   среднее заначение этих трех чисел.
    */
    public static void main(String[] args) {


        float numberOne = 100.12f;
        float numberTwo = 300.45f;
        float numberTree = 400.56f;
        float sum = numberOne + numberTwo + numberTree;
        System.out.println(sum);
        float result = sum/3;
        System.out.println(result);

        System.out.println("------------------");

        double numberOneDouble = 100.12;
        double numberTwoDouble = 300.45;
        double numberTreeDouble = 400.56;
        double sumDouble = numberOneDouble + numberTwoDouble + numberTreeDouble;
        System.out.println(sumDouble);
        double resultDouble = sum/3;

        System.out.println(resultDouble);
    }

}

package lesson11;


public class Calculator {
    private static String operation ="+";
    private static double numberOne = 10;
    private static double numberTwo = 30;

    public static void main(String[] args) {
        double result;
       switch (operation){
           case "+":
               result =sumNumbers(numberOne, numberTwo);
               break;
           default:
               System.out.println("Не правильная операция");
               result = 0;
               break;
       }
        System.out.println(result);
    }
    private static double sumNumbers(double firstNumber, double secondNumber){
        return  firstNumber + secondNumber;

    }
}

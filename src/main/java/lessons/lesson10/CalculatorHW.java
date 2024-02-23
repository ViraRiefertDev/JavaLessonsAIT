package lessons.lesson10;
import java.util.Scanner;
public class CalculatorHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Калькулятор операций-------");
        boolean continueOperation = true;
        while (continueOperation) {
            System.out.println("Выбери операцию(сложение (+), вычитание (-), умножение (*), деление (/)) :  ");
            String operation = scanner.next();
            System.out.println("Введи первое число, с которым будет проведена операция: ");
            double number1 = scanner.nextDouble();
            System.out.println("Введи второе число, с которым будет проведена операция: ");
            double number2 = scanner.nextDouble();
            if (operation.equals("+")) {
                double sum = number1 + number2;
                System.out.println(sum);
            } else if (operation.equals("-")) {
                double difference = number1 - number2;
                System.out.println(difference);
            } else if (operation.equals("*")) {
                double valueOfProduct = number1 * number2;
                System.out.println(valueOfProduct);

            } else if (operation.equals("/")) {
//                if (number2 != 0) {
//                    double valueOfQuotient = number1 / number2;
//                    System.out.println(valueOfQuotient);

//                }
//            else {
                    while (number2 == 0) {
                        System.out.println("Ошибка! Введи второе число еще раз:  ");
                        number2 = scanner.nextDouble();
                    }
                    double valueOfQuotient = number1 / number2;
                    System.out.println(valueOfQuotient);
//                }

            }
            System.out.println("Хочешь продолжить? Да или Нет");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Нет")) {
                continueOperation = false;
                System.out.println("Конец");
            }
        }

        scanner.close();
    }

}

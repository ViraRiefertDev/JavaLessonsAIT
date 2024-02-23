package homework.homework09;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char mathOperation;
        String inputNumber1;
        String inputNumber2;
        char[] charDigit;
        boolean isDigit = true;
        double number1;
        double number2;
        int numberOfPoints = 0;
        double result;
        boolean isContinue = true;
        boolean isNull = false;
        char continueTheOperation;
        boolean isFirst = true;

        while (isContinue) {
            do {
                if (isFirst) {
                    System.out.println("Выберите операцию. Введите один из следующих символов * - + /");
                    isFirst = false;
                } else {
                    System.out.println("Вы ввели чтото не то");
                    System.out.println("Надо ввести один из следующих символов * - + /");
                }
                mathOperation = scanner.next().charAt(0);
            } while (!(mathOperation == '+' || mathOperation == '-' || mathOperation == '*' || mathOperation == '/'));
            isFirst = true;
            do {
                if (isFirst) {
                    System.out.print("Введите первое число(целое или дробное число через точку):");
                    isFirst = false;


                } else {
                    isDigit = true;
                    System.out.println("Вы ввели чтото не то");
                    System.out.print("Надо ввести первое число(целое или дробное число через точку):");
                }
                inputNumber1 = scanner.next().strip();
//
                charDigit = inputNumber1.toCharArray();
                numberOfPoints = 0;


                if (inputNumber1.isEmpty()) {
                    isDigit = false;
                } else {
                    for (int i = 0; i < inputNumber1.length(); i++) {
                        if (charDigit[i] == '.' && numberOfPoints <= 1) {
                            numberOfPoints++;
                        } else if (!Character.isDigit(charDigit[i]) || numberOfPoints > 1) {
                            isDigit = false;
                        }
                    }


                }
            } while (!isDigit);

            number1 = Double.parseDouble(inputNumber1);


            isFirst = true;
            do {
                do {
                    if (isFirst) {
                        System.out.print("Введите второе число(целое или дробное число через точку):");
                        isFirst = false;


                    } else {
                        isDigit = true;
                        if (!isNull) {
                            System.out.println("Вы ввели чтото не то");
                            System.out.print("Надо ввести второе число(целое или дробное число через точку):");
                        } else {
                            System.out.println("Введите число отличное от 0!");
                            isNull = false;
                        }

                    }
                    inputNumber2 = scanner.next().strip();
//
                    charDigit = inputNumber2.toCharArray();
                    numberOfPoints = 0;
                    if (inputNumber2.isEmpty()) {
                        isDigit = false;
                    } else {
                        for (int i = 0; i < inputNumber2.length(); i++) {
                            if (charDigit[i] == '.' && numberOfPoints <= 1) {
                                numberOfPoints++;

                            } else if (!Character.isDigit(charDigit[i]) || numberOfPoints > 1) {
                                isDigit = false;
                            }

                        }
                    }
                } while (!isDigit);
                number2 = Double.parseDouble(inputNumber2);


                if (mathOperation == '/' && number2 == 0) {
                    System.out.println("Делить на ноль нельзя!");
                    isNull = true;
                }
//

            } while (isNull);

            if (mathOperation == '+') {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            } else if (mathOperation == '-') {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            } else if (mathOperation == '*') {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            } else {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }

            isFirst = true;
            do {
                if (isFirst) {
                    System.out.println("Хотите продолжить выполнение операций y/n");
                    isFirst = false;

                } else {
                    System.out.println("Вы ввели чтото не то");
                    System.out.println("Надо ввести \"y\" если хотите продолжить и ");
                    System.out.println("\"n\" если хотите выйти из программы!");
                }
                continueTheOperation = scanner.next().charAt(0);
            } while (!(continueTheOperation == 'y' || continueTheOperation == 'n'));
            isFirst = true;
            if (continueTheOperation == 'n') {
                isContinue = false;
            }


        }
        scanner.close();
    }
}


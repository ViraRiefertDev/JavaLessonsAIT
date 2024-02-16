package Homework.Homework09;

import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continueTheOperation;
        int guessNumber;
        String inputNumberStr = "";
        int inputNumber;
        boolean isFirst = true;
        boolean isContinue = true;
        boolean numberIsGuessed = false;
        boolean isDigit = true;
        boolean isMaxAttempts = false;
        char[] charDigit;
        int numberOfAttempts = 0;
        char maxAttemptsInput;
        int maxAttempts = 0;

        while (isContinue) {
            do {
                System.out.println("Выберите уровень сложности: ");
                System.out.println("1 - Easy : количество попыток = 30");
                System.out.println("2 - Middle : количество попыток = 20");
                System.out.println("3 - Hard : количество попыток = 10");
                System.out.println("4 - Monster : количество попыток = 5");
                maxAttemptsInput = scanner.next().charAt(0);

                switch (maxAttemptsInput) {
                    case '1':
                        maxAttempts = 30;
                        break;
                    case '2':
                        maxAttempts = 20;
                        break;
                    case '3':
                        maxAttempts = 10;
                        break;
                    case '4':
                        maxAttempts = 5;
                        break;
                    default:
                        System.out.println("Вы ввели чтото не то");
                        break;
                }
            } while (maxAttempts == 0);
            guessNumber = (int) ((Math.random() * (100) + 1));
            System.out.println(guessNumber);
            while (!numberIsGuessed && !isMaxAttempts) {
                isFirst = true;
                do {
                    if (isFirst) {

                        isFirst = false;


                    } else {
                        if (!isDigit) {
                            System.out.println("Вы ввели чтото не то! " + "Не надо так!😿");

                        } else {
                            System.out.println("Попробуйте еще раз");
                        }
                        isDigit = true;
                    }
                    System.out.print("Введите число от 1 до 100: ");
                    inputNumberStr = scanner.next().strip();
                    if (inputNumberStr.isEmpty()) {
                        isDigit = false;

                    } else {
                        charDigit = inputNumberStr.toCharArray();
                        for (int i = 0; i < inputNumberStr.length(); i++) {
                            if (!Character.isDigit(charDigit[i])) {
                                isDigit = false;
                            }
                        }
                    }
                } while (!isDigit);
                inputNumber = Integer.parseInt(inputNumberStr);

                numberOfAttempts++;
                if (inputNumber == guessNumber) {
                    System.out.print("Вы угодали число! " + "⭐😏");
                    System.out.println("\uD83D\uDE38");
                    System.out.println("Количество попыток: " + numberOfAttempts);
                    numberOfAttempts = 0;
                    numberIsGuessed = true;
                } else {
                    if (maxAttempts == numberOfAttempts) {
                        isMaxAttempts = true;
                        System.out.println("Вы использовали максимальное количество попыток: " + numberOfAttempts);
                        System.out.println("Вы проиграли!");
                        System.out.println("😢");
                    } else if (inputNumber == 0 || inputNumber > 100) {
                        System.out.println("Вы ввели число > 100 или 0");
                        numberOfAttempts--;
                    } else if (inputNumber < guessNumber) {
                        System.out.println("Слишком маленькое число!");
                    } else {
                        System.out.println("Слишком большое число!");

                    }
                }
            }
            isFirst = true;
            do {
                if (isFirst) {

                    System.out.println("Хотите сыграть еще раз? y/n");
                    isFirst=false;


                } else {
                    System.out.println("Вы ввели чтото не то");
                    System.out.println("Надо ввести \"y\" если хотите сыграть еще раз и ");
                    System.out.println("\"n\" если хотите выйти из игры!");
                }
                continueTheOperation = scanner.next().charAt(0);
            } while (!(continueTheOperation == 'y' || continueTheOperation == 'n'));
            if (continueTheOperation == 'n') {
                isContinue = false;
            } else {
                numberIsGuessed = false;
            }

        }

    scanner.close();
    }
}



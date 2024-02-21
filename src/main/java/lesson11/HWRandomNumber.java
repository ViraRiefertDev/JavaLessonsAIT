//проработать hasNextInt.. все нюансы особенно в связке scanner.next(); строка 18-20

package lesson11;
import java.util.Scanner;
public class HWRandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gameChoice;
        do {
            int randomNumber = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("Угадайте число от 1 до 100. У Вас "
                    + maxAttempts + " попыток.");
            while (true){
                System.out.println("Введите Вашу предположение (1-100)");
                //hasNaxtInt блокирует scanner.next(); если мы ввели ?не? правильное значение
                while (!scanner.hasNextInt()){
                    System.out.println("Ошибка, введите число");
                    scanner.next();
                }
                int number = scanner.nextInt();
                if(number < 1 || number > 100){
                    System.out.println("Число должно быть в диапазоне 1 - 100");
                    continue;
                }
                attempts++;
                if(number> randomNumber){
                    System.out.println("Число слишком большое");
                }
                else if(number< randomNumber){
                    System.out.println("Число слишком маленькое");
                }
                else{
                    System.out.println("Победа! Вы угодали " + randomNumber);
                    break;
                }
                if(attempts>= maxAttempts){
                    System.out.println("Вы использовали все попытки. Игра закончена");
                }
            }
            System.out.println("Хотите еще раз поиграть? (y/n");
            gameChoice = scanner.next().toLowerCase().charAt(0);

        }
        while (gameChoice == 'y');
        System.out.println("Конец игры! Спасибо за игру!");
            scanner.close();

    }
}

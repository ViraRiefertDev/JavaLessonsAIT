package homework.homework08;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        //Пользователь вводит число. Посчитать сумму всех его цифр
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNumber= scanner.nextInt();
        int sum =0;
        int numberLength = String.valueOf(inputNumber).length();
        for(int i=numberLength-1; i>=0;i--){
            int digit = inputNumber/(int)Math.pow(10,i) % 10;
            System.out.print(digit);
            if(i!=0){
                System.out.print(" + ");
            }
            sum+=digit;
        }
        System.out.println(" = " + sum);
     char ch = scanner.next().charAt(0);



    }
}

package lessons.lesson08;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите сколько угодно чисел чтобы посчитать смумму (0 для остановки)");
        int n = scanner.nextInt();
        while(n !=0){
            sum+=n;
            n = scanner.nextInt();
        }
        System.out.println("Ответ: " + sum);
    }


}

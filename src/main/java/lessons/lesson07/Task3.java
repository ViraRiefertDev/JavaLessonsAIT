// форматированный вывод System.out.printf("%.2f", res);
package lessons.lesson07;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа, которые нужно разделить");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String res;
        if(b==0) {
            res = "Делить на ноль нельзя!";
        }
        else{
        res = (a + " / " + b )+ " = " + (a/b);
        }
        System.out.println(res);
    }
}

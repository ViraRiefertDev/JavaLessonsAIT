package lesson08;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt()-2;
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        int counter = 0;
        while(counter<n){
            if(counter %2 ==0){
                n1 = n1+n2;
                System.out.print(n1 + " ");
            }
            else {
                n2 = n1 + n2;
                System.out.print(n2 + " ");
            }
            counter++;
        }
    }
}

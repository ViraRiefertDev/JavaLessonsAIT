package homework.homework12;
import java.util.Scanner;
public class StringReverseVar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.next();
        String reverseWord = new StringBuilder(word).reverse().toString();
        if(word.equals(reverseWord)){
            System.out.println("Is palindrome"); // print "yes"
        }else{
            System.out.println("Not a palindrome");  // print "false"
        }
    }
}

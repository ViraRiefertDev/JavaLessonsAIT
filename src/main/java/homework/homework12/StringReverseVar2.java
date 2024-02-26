package homework.homework12;
import java.util.Scanner;
public class StringReverseVar2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int i = 0, j = word.length() - 1;
        while(i < j)
        {
            if(word.charAt(i) != word.charAt(j))
            {
                System.out.println("Not palindrome ");
                System.exit(0);

            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}


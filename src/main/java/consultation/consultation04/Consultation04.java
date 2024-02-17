package consultation.consultation04;
import java.util.Scanner;
public class Consultation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Написать программу, которая сравнивает 2 строки по длинне
        System.out.println("Введите строку 1:");
        String s1= scanner.nextLine();
        System.out.println("Введите вторую строку ");
        String s2 = scanner.nextLine();
        if(s1.length()>s2.length()){
            System.out.println("Первая строка длиннее");
        }
        else if(s2.length()>s1.length()){
            System.out.println("Вторая строка длиннее");
        }
        else{
            System.out.println("Строки одинаковой длиннее");
        }



    }
}

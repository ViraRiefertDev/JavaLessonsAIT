package homework.homework06;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Калькулятор Оценок: Создайте программу, которая запрашивает у пользователя оценки по пяти предметам, затем
        // рассчитывает и выводит средний балл.
        System.out.println("Введите оценки по 5 предметам:");
        System.out.print("Алгебра: ");
        int algebra = scan.nextInt();
        System.out.print("История: ");
        int history = scan.nextInt();
        System.out.print("Информатика: ");
        int informatik = scan.nextInt();
        System.out.print("Английский язык: ");
        int english = scan.nextInt();
        System.out.print("Физика: ");
        int physik = scan.nextInt();
        scan.close();
        float avarage = (float)(algebra+history+informatik+english+physik)/5;
        System.out.println("Средний балл: " + avarage);



    }
}

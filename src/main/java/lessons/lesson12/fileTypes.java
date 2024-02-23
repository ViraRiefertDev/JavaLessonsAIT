package lessons.lesson12;
import java.util.Scanner;
public class fileTypes {
    public static void main(String[] args) {
        /*
        Напишите программу, которая принимает на вход расширение файла
        (на пример, "pdf", "docx", "jpg")
        и выводит тип файла (Документ, Изображение и т.д.).
        Используйте 'switch-case' для обработки разных расширений.
         */
        Scanner scanner = new Scanner(System.in);
        String fileExtension = scanner.next().trim();
        String fileTyp;
        fileTyp=switch (fileExtension.toLowerCase()){
            case "pdf","doc"->"Это Документ";
            case "jpg","svg"->"Это изобажение";
            default -> "Тип документа не найден!";
        };
        printCarData(fileTyp);
    }
    public static void printCarData(String fileTyp){
        System.out.println(fileTyp);
    }
}

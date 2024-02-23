package lessons.lesson07;
import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int day, month,year;

        System.out.println("Как Вас зовут? ");
        name = scanner.nextLine();
        System.out.println("Введите день рождения");
        day = scanner.nextInt();
        System.out.println("Введите месяц рождения(числом)");
        month = scanner.nextInt();
        System.out.println("Введите год рождения");
        year = scanner.nextInt();

        double result = Math.sin((name.length() + day*month)+year);
        System.out.println(result);
        if(result<0.15){
            System.out.println("У вас очень плохая удача");
        }
        else if(result<0.25){
            System.out.println("У вас будет невеселая жизнь ");
        }
        else if(result<0.5){
            System.out.println("У вас будет серая и скучная жизнь");
        }
        else if(result<0.7){
            System.out.println("У вас будет хорошая жизнь");
        }
        else if (result < 0.95) {
        System.out.println("У вас будет радостная жизнь");
        }
        else {
        System.out.println("У вас будет шикарная и богатая жизнь");
        }




    }
}

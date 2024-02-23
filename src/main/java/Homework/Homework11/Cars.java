package Homework.Homework11;
import java.util.Locale;
import java.util.Scanner;
public class Cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carBrand;
        int yearManufact;
        System.out.print("Введите марку автомобиля: ");
        carBrand = scanner.next().toLowerCase();
        System.out.println("Введите год выпуска");
        while(!scanner.hasNextInt()){
            System.out.println("Oшибка! Введите число: ");
            scanner.next();
        }
        yearManufact = scanner.nextInt();

        switch (carBrand){
            case "honda":{
                System.out.println(Honda.getCountry());
                Honda.MoreInfo(yearManufact);
              break;
            }
            case "bmw":{
                System.out.println(BMW.getCountry());
                BMW.MoreInfo(yearManufact);
                break;
            }
            case "audi":{
                System.out.println(Audi.getCountry());
                Audi.MoreInfo(yearManufact);
                break;
            }
            case "mazda":{
                System.out.println(Mazda.getCountry());
                Mazda.MoreInfo(yearManufact);
                break;
            }
            default:
                System.out.println("Данные об этой марке машини отсутствуют!");

        }

    }
}

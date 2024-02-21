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
                Honda honda = new Honda();
                System.out.println(honda.getCountry());
                honda.MoreInfo(yearManufact);
              break;
            }
            case "bmw":{
                BMW bmw = new BMW();
                System.out.println(bmw.getCountry());
                bmw.MoreInfo(yearManufact);
                break;
            }
            case "audi":{
                Audi audi = new Audi();
                System.out.println(audi.getCountry());
                audi.MoreInfo(yearManufact);
                break;
            }
            case "mazda":{
                Mazda mazda = new Mazda();
                System.out.println(mazda.getCountry());
                mazda.MoreInfo(yearManufact);
                break;
            }
            default:
                System.out.println("Данные об этой марке машини отсутствуют!");

        }

    }
}

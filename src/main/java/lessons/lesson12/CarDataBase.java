package lessons.lesson12;
import java.sql.SQLOutput;
import java.util.Scanner;
//trim() все пробелы будут обрезаны
//будем искать информацию о марках по эпохам и сделаем вложенным switch
//cначала дэбагер запускаем и строчку выделяем, лкм --> Evaluate (песочница, где показывается что выдает определенная строка кода)
public class CarDataBase {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите марку автомобиля: ");
        String carBrand = scanner.next().trim();
        System.out.println("Введите четырехзначный год выпуска: ");
        String countryOfOrigin;
        String carInfo;
        while (!scanner.hasNextInt()){
            System.out.println("Ошибка, введите число");
            scanner.next();
        }
        int year = scanner.nextInt();
        switch (carBrand.toLowerCase()){
            case "ford":
                countryOfOrigin = "США";
                carInfo = year<1990 ? "Огромные внедорожники, дешевый бензин" : "Эпоха гибридов, Тесла, ИИ в авто";
                break;
            case "volvo":
                countryOfOrigin = "Швеция";
                carInfo = year>2002 ? "Выход модели XC 90":"Покупайте модель S 60";
                break;
            default:
                countryOfOrigin ="Не найдена";
                carInfo = "Нет информации";
                break;
        }
        printCarData(countryOfOrigin,carInfo);
    }

    public static void printCarData(String country, String info){
        System.out.println("Страна производитель " + country);
        System.out.println("Дополнительная информация " + info);
    }

}

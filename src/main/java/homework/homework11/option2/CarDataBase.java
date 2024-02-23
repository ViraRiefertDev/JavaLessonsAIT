package homework.homework11.option2;
import java.util.Scanner;
public class CarDataBase {
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
        String countryOfOrigin;
        String moreInfo;
        String historyOfCreation;

        switch (carBrand){
            case "honda":{
                countryOfOrigin = "Япония";
                historyOfCreation = "Была основана в 1946 году японским автогонщиком и, в том же время, великолепным механиком Соичиро Хондой.";
                if(yearManufact<1946){
                    moreInfo ="Компания еще не создана";
                }
                else if(yearManufact == 1947){
                    moreInfo = "Основан Технологический Исследовательский Институт Хонды, который занимался приобретением списанных двигателей, осуществлением их ремонта, установкой на велосипеды и последующим обеспечением жителей японских деревень транспортом.";
                }
//                else if(yearManufact == 1948)


            }
            case "bmw":{

            }
            case "audi":{

            }
            case "mazda":{

            }
            default:
                System.out.println("Данные об этой марке машини отсутствуют!");

        }

    }
}


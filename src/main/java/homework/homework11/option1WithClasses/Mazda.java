package homework.homework11.option1WithClasses;

public class Mazda {
    private static String country = "Японская марка автомобиля";

    public static void MoreInfo(int year){
        switch (year){
            case 2024:
                System.out.println("Популярные модели:\nSedan Mazda 3\nhatchback Mazda 3\nMazda CX-30");
                break;
            case 2018:
                System.out.println("Популярные модели:\nMazda 3\nMazda 6");
                break;
            case 2005:
                System.out.println("Популярные модели:\nMazda mx5\nMazda Atenza\nMazda Biante");
                break;
            default:
                System.out.println("Данные об этом годе выпуска отсутствуют");
                break;

        }
    }



    public static String getCountry() {
        return country;
    }
}

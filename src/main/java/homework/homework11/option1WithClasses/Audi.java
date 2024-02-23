package homework.homework11.option1WithClasses;

public class Audi {
    private static String country = "Немецкая марка автомобиля";

    public static void MoreInfo(int year) {
        switch (year) {
            case 2024:
                System.out.println("Популярные модели: \nAudi Q8\nAudi Q5 Sportback \nAudi SQ8 2024\nAudi A6 2024");
                break;
            case 2018:
                System.out.println("Популярные модели:\nAudi A1\nAudi A3\nAudi A4\nAudi A5\nAudi A6\nAudi A7\nAudi A8\nAudi Q2\nAudi Q3\nQ4\nAudi Q7");
                break;
            case 2005:
                System.out.println("Популярные модели:\nAudi A6 (C6) Sedan\nAudi FSI MT\nAudi FSI multitronic");
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

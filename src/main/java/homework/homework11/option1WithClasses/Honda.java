package homework.homework11.option1WithClasses;

public class Honda {

    private static String country = "Японская марка автомобиля";

    public static void MoreInfo(int year){
        switch (year){
            case 2024:
                System.out.println("Популярные модели:\nHonda e:NP1\nHonda e:NS1\nHonda Vezel\nHonda ZR-V\nС акцентом на электроавтомобили");
                break;
            case 2018:
                System.out.println("Популярные модели:\nHonda Fit\nHonda Passport\nHonda Civic Type R\nHonda Pilot\nHonda CR-V\nHonda Insight\nHonda Ridgeline");
                break;
            case 2005:
                System.out.println("Популярные модели:\nHonda CH80\nHonda CHF50S\nHonda Civic Hybrid");
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




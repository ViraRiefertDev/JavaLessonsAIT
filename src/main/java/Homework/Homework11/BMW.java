package Homework.Homework11;

public class BMW {
    private String country = "Немецкая марка автомобиля";

    public void MoreInfo(int year){
        switch (year){
            case 2024:
                System.out.println("Популярные модели:\nBMW X2\nBMW 4er/I4 LCI\nBMW M5 und M5 Touring");
                break;
            case 2018:
                System.out.println("Популярные модели:\nBMW X2\nBMW X4\nBMW 6-Series Gran Coupe\nBMW 6-Series Gran Turismo");
                break;
            case 2005:
                System.out.println("Популярные модели:\nBMW 520d MT\nBMW Touring 525i\nBMW 5-series");
                break;
            default:
                System.out.println("Данные об этом годе выпуска отсутствуют");
                break;

        }
    }



    public String getCountry() {
        return country;
    }
}

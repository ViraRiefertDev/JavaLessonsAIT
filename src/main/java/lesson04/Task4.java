package lesson04;

public class Task4 {
    public static void main(String[] args) {
        int lead_1 = 100;
        int lead_2 = 356;
        int lead_3 = 487;
        //Вычеслим значение в минутах секундах для первой песни
        //Вычисляем минуты
        int minutes = lead_2/60;
        //Вычисляем секунды
        int seconds = lead_2 - minutes*60;
        System.out.println(minutes + ":" + seconds);
        /*int sum = lead_1 + lead_2 + lead_3;
        String leads = sum/60+ ":" + sum%60;
        System.out.println("Продолжительность песeн: " + leads );
        float a = 500;
        float b = 550;
        float c = 600;

        float out = (a+b+c) /60;

        System.out.println ( (a /60) + " " + (b /60) + " " + (c /60) + " " + out);*/


    }
}

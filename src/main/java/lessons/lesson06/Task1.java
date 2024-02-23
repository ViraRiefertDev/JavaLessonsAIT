package lessons.lesson06;

public class Task1 {
    public static void main(String[] args) {
        /*
        Напишите программу, которая рассчитвает скидку на основе
        суммы покупки и стажа покупателя в магазине.
        Если сумма покупки превышает 1000,
        скидка составляет 10%. Дополнительно,
        если стаж покупателя более 5 лет, добавляется еще 5% к скидке
         */
        //покупательский стаж
        int experience =6;
        double sum = 2000;
        double discount = 0;
        double sumWithDiscount;

        if(sum>1000){
            discount =0.1;
            sumWithDiscount =sum - (sum *discount);
            if(experience>5){
                discount =0.05;
                sumWithDiscount =sumWithDiscount - (sumWithDiscount* discount);
                }
        }
        else
            sumWithDiscount=sum;


        System.out.println("Cумма к оплате= " + sumWithDiscount);
        System.out.println("Cумма скидки =" + (sum-sumWithDiscount));
//        int experience =5;
//        //сумма покупок
//        double sum = 1000;
//        //сумма скидки
//        double discount = 0;
//
//        if(sum> 1000 && experience>5){
//            discount+=0.15;
//        }
//
//        if(experience>5){
//            discount+=0.05;
//        }
//        sum = sum*discount+sum;
//        double totalSum = sum - discount;
//        System.out.println("Сумма покупки " + sum);
//        System.out.println("Стаж покупателя " + experience + "лет");
//
//        System.out.println("Размер скидки " + (discount*100)+ "%");
//        System.out.println("Cумма скидки " + discount);
//        System.out.println("Итоговая сумма " + summ);

    }
}

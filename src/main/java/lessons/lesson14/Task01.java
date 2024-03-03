package lessons.lesson14;

import java.util.Arrays;
import java.util.Scanner;
//если переменная не инициализированна то внутри метода интеледж заругкается, а если это классовая неинициализированная переменная, то все ОК

public class Task01 {
    static Scanner scanner = new Scanner(System.in);
   private static double[] balances = {-1000.50, 2000.75, -300.40, 5400.0, 12300.30};

    public static void main(String[] args) {
        //Напишите код для расчета среднего баланса по всем счетам
        double sum =0;
        double average;
        for(int i=0; i<balances.length;i++){
            sum = balances[i] + sum;
        }
        average = sum/balances.length;
        System.out.println("Средний балланс: " + average);

        //Определить количество счетов с балансом выше заданного значения 5000
        int counter = 0;
        for(int i=0; i<balances.length; i++){
            if(balances[i]>5000){
                counter++;
            }
        }
        System.out.println("Количество счетов с балансом выше 5000 = " + counter);

         /*
        Если счета могут иметь отрицательный баланс,
        посчитайте общую сумму долга по всем счетам.
         */
        double amountOfDebt = 0;
        for(int i=0; i< balances.length;i++){
            if (balances[i]<0){
                amountOfDebt += balances[i];
            }
        }
        System.out.println("Общая сумма долга = " + amountOfDebt);

        /*
        Предположим, что некоторые счета ушли в минус.
        Заменить все отрицательные баллансы на 0
         */
        for(int i = 0; i<balances.length;i++){
            if(balances[i]<0){
                balances[i]=0;
            }
        }
        for (int i = 0; i<balances.length;i++){
            System.out.print(balances[i] + " ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(balances));


    }



}

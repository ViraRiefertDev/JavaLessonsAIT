package lessons.lesson13;

import java.util.Scanner;

public class JavaArrays {
    static Scanner scanner = new Scanner(System.in);

    /*Как мы объявляем
      тип[] название контейнера
     */
    public static void main(String[] args) {
        //по синтаксису языка если мы сразу вносим занчения {} то можно не указывать new[]{.....}
        //массив для небольших объемов данных, где контейнер не будет динамически расширяться
        //преимущество: манипулировать  с такими данными будет труднее
        int[] salaryMax = {400, 350, 500, 200, 300};

        int[] salaryMaria = new int[7];
        salaryMaria[0] = 350;
        salaryMaria[1] = 400;
        salaryMaria[2] = 450;
        salaryMaria[3] = 470;
        salaryMaria[4] = 400;
        salaryMaria[5] = 490;
        salaryMaria[6] = 250;

        int salaryMaxFirstMonth = salaryMax[0];
        int sizeSalaryMax = salaryMax.length;
        System.out.println(salaryMaxFirstMonth);
//
       // здесь можно пройти только часть массива
//        for (int j : salaryMaria) {
//            System.out.println(j);
//        }

//      тут проходим массив без остновки
        //каждый элемент который вытаскивает из массива называет его salary
        for(int salary: salaryMaria){
            System.out.println(salary);
        }

    }
}
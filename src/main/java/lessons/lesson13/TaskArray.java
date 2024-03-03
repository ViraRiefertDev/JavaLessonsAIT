package lessons.lesson13;

import java.util.Arrays;

public class TaskArray {

    public static void main(String[] args) {
        /*
        Напишите метод, который принимает
        массив целых чисел и возваращает
        минимальное значение из этого массива
         */
        String str = "Hello";
        str.concat(" World");
        System.out.println(str);
        int a = 3;
        int b = 5;
        int c = a * b++;
        System.out.println(c);
        int[] salaryMaria = new int[7];
        salaryMaria[0] = 350;
        salaryMaria[1] = 400;
        salaryMaria[2] = 450;
        salaryMaria[3] = 470;
        salaryMaria[4] = 400;
        salaryMaria[5] = 490;
        salaryMaria[6] = 250;
        int minSalary =getMinSalary(salaryMaria);
        System.out.println("Минимальная зарплата= " + minSalary);
        System.out.println(checkElementsInArray(salaryMaria));
        int[] arrayOne = {1,2,3,4};
        int[] arrayTwo = {6,7,8};
        int[] arraySum = sumArrays(arrayOne, arrayTwo);
        for(int i =0; i<arraySum.length;i++){
            System.out.print(arraySum[i] + " ");
        }

    }
    public static int getMinSalary(int[] salary){
        int minSalary= salary[0];
        for(int i = 1;i<salary.length;i++){
            if(salary[i]<minSalary){
                minSalary=salary[i];
            }
        }
//        for(int sal:salary){
//            if(minSalary>sal){
//                minSalary=sal;
//            }
//        }
        return minSalary;
    }

    // Метод проверяет, стоят ли элементы массива в порядке возрастания

    public static boolean checkElementsInArray(int[] elements){
        //1,2,3,4,5,6,7,8
        for(int i=0; i<elements.length-1; i++){
            if(elements[i+1]<elements[i]){
                return false;
            }
        }
        return true;
    }

    /*
    Реализуйте метод, который принимает два массива целых чисел,
    и объединяет в один массив.
     */

    public static int[] sumArrays(int[] arrayOne, int[] arrayTwo){
        int[] arraySum = new int[arrayOne.length + arrayTwo.length];
        for(int i=0;i<arraySum.length;i++){
            if(i<arrayOne.length){
                arraySum[i] = arrayOne[i];
            }
            else {
                arraySum[i] = arrayTwo[i-arrayOne.length];
            }
        }
        Arrays.sort(arraySum);
        return arraySum;
    }
    //arraycopy
    //1 копируем от куда (источник)
    // копируем с какой позиции
    // копируем куда
    // куда с какой позиции копировать
    //указываем все ли будем копировать (тут все еще можно указать на пример 2 элемента и с 5ого элемента (второй параметр)
    public static int[] sumArraysNew (int[] arrayOne, int[] arrayTwo){
        int[] sumArray = new int[arrayOne.length + arrayTwo.length];
        System.arraycopy(arrayOne,0,sumArray,0,arrayOne.length);
        System.arraycopy(arrayTwo,0,sumArray,arrayOne.length,arrayTwo.length);
        Arrays.sort(sumArray);
        return sumArray;
    }
}

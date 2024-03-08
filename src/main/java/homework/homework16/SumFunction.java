package homework.homework16;

public class SumFunction {
    public static void main(String[] args) {
        //Задание 1.2 Продемонстрируйте работу функции,
        //передав ей различное количество аргументов.
        int sum1 = sumNumbers(2, 3);
        int sum2 = sumNumbers(2, 3, 4);
        int sum3 = sumNumbers(2, 3, 4, 5);
        int sum4 = sumNumbers(2, 3, 4, 5, 6);
        int sum5 = sumNumbers(-2, 3, 4, -5, 6);

        printSum(sum1,2,3);
        printSum(sum2,2,3,4);
        printSum(sum3,2,3,4,5);
        printSum(sum4,2,3,4,5,6);
        printSum(sum5, -2,3,4,-5,6);
    }
    //Задание  1.1 Создайте функцию sum, которая принимает переменное
    // количество целочисленных аргументов и возвращает их сумму.
    public static int sumNumbers(int ... numbers){
        if(arePositiveNumbers(numbers)){
        int sum = 0;
        for(int number:numbers){
            sum +=number;
        }
        return sum;}
        else {
            return -1;
        }
    }

    /*
    Дополнительное задание
    Проверка на отрицательные числа при суммировании.
     */
    public static boolean arePositiveNumbers(int ... numbers){
        for(int number:numbers){
            if(number<0){
                return false;
            }
        }
        return true;
    }

    public static void printSum( int sum, int ... values) {
        if(sum!=-1){
        String addition ="";
        for(int i: values){
            System.out.print(addition + i);
            addition = "+";
        }
        System.out.println("=" + sum);}
        else{
            System.out.println("Невозможно посчитать сумму элементов, присутствуют отрицательные аргументы!");
        }
    }


}

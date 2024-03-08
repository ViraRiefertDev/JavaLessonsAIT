package homework.homework16;


public class StatisticalAnalyzer {
    public static void main(String[] args) {
        statistics(2.3, 3.4, 4.3, 28.5);
        statistics(2.3, 3.4, 4.3, 28.5, 34, 2, 0, 1);
        statistics(2.3);
        statistics();
        statistics(-2.3, 3.4, 4.3, 28.5,-3.7);
    }


    public static double sumNumbers(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /*
    Задание 2.1
    Реализуйте функцию statistics, принимающую переменное количество вещественных чисел (double)
    и выводящую на экран базовую статистику: минимальное значение, максимальное значение, среднее
    значение.
     */
    public static void statistics(double... numbers) {
        System.out.println("Статистические данные по " + numbers.length + " аргументам:");
        if (arePositiveNumbers(numbers)) {
            if (numbers.length > 0) {
                double minValue = numbers[0];
                double maxValue = numbers[0];
                for (double number : numbers) {
                    //minValue
                    if (number < minValue) {
                        minValue = number;
                    }
                    //maxValue
                    if (number > maxValue) {
                        maxValue = number;
                    }
                }
                //average
                double sum = sumNumbers(numbers);
                double average = sum / numbers.length;
                System.out.println("Минимальное значение: " + minValue);
                System.out.println("Максимальное значение: " + maxValue);
                System.out.println("Среденее арифметическое " + average);

            }
            /*
            Задание 2.2
            Обработка случая, когда аргументы не передаются (вывод соответствующего сообщения).
             */
            else {
                System.out.println("Аргументы для обработки не обнаружены!");
                System.out.println("Нужно передать хотя бы один аргумент!");
            }
        }
        else{
            System.out.println("Невозможно проанализировать данные, присутствуют отрицательные аргументы!");
        }
        System.out.println(" ");


    }
    /*
    Дополнительное задание
    Проверка на отрицательные числа при расчете статистики.
     */
    public static boolean arePositiveNumbers(double... numbers) {
        for (double number : numbers) {
            if (number < 0) {
                return false;
            }
        }
        return true;
    }
}

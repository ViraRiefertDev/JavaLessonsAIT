package homework.homework46;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Task 01 -------------");
        /**
         * Задание 1: Вывести элементы списка строк
         * Задача: Используя Stream API, выведите на экран все строки из списка.
         */
        List<String> fruits = Arrays.asList("apple","plum", "banana","cherry","kiwi","Lime","jackfruit");
        fruits.stream().forEach(System.out::println);

        System.out.println("------- Task 02 -------------");
        /**
         * Задание 2: Преобразовать строки в верхний регистр
         * Задача: Используя Stream API, преобразуйте все строки из списка в верхний регистр
         * и соберите результат в новый список.
         */
       List<String> newFruits = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newFruits);

        System.out.println("------- Task 03 -------------");
        /**
         * Задание 3: Подсчитать количество строк с длиной больше 4 символов
         * Задача: Используя Stream API, подсчитайте количество строк в списке, которые содержат более 4 символов.
         */
        long count = fruits.stream().filter(fruit -> fruit.length()>4).count();
        System.out.println(count);

        System.out.println("------- Task 04 -------------");
        /**
         * Задание 4: Найти первый элемент, начинающийся на заданную букву
         * Задача: Используя Stream API, найдите первый элемент в списке, который начинается на букву 'j'.
         */
        List<String> tools = Arrays.asList("hammer", "jack","wrench", "jackhammer");
        String toolWithJ = tools.stream().filter(tool -> tool.startsWith("j")).findFirst().orElse("none");
        System.out.println(toolWithJ);

        System.out.println("------- Task 05 -------------");
        /**
         * Задание 5: Фильтрация и сортировка числового списка
         * Задача: Отфильтруйте список чисел, оставив только те, которые больше 10, и затем отсортируйте оставшиеся элементы.
         */
        List<Integer> numbers = Arrays.asList(5,21,1,13,8);
        numbers.stream().filter(number -> number > 10).sorted().forEach(System.out::println);

        System.out.println("------- Task 06 -------------");
        /**
         * Задание 6: Сгруппировать строки по начальной букве
         * Задача: Используя Stream API, сгруппируйте строки из списка по начальной букве.
         */
        List<String> animals = Arrays.asList("ant", "bear","alligator");
        Map<Character, List<String>> groupByFirstLetter = animals.stream().collect(Collectors.groupingBy(animal -> animal.charAt(0)));

        groupByFirstLetter.forEach((key,value) -> System.out.println(key + ":" + value));

        System.out.println("------- Task 07 -------------");
        /**
         * Задание 7: Суммирование значений в списке
         * Задача: Используя Stream API, найдите сумму всех чисел в списке.
         */
        List<Integer> values = Arrays.asList(2, 3, 5, 7, 11);
        long sum = values.stream().
                //вытаскиваем из класса обертки Integer примитивный int
                mapToInt(Integer::intValue).sum();
        System.out.println("Сумма всех чисел: " + sum);


        System.out.println("------- Task 08 -------------");
        /**
         * Задание 8: Получить статистику по числовому списку
         * Задача: Используя Stream API, получите статистику (минимум, максимум) по списку чисел.
         */
        List<Integer> stats = Arrays.asList(10, 20, 30, 40, 50);
        IntSummaryStatistics intSummaryStatistics = stats.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Max value " + intSummaryStatistics.getMax());
        System.out.println("Min value " + intSummaryStatistics.getMin());

        System.out.println("------- Task 09 -------------");
        /**
         * Задание 9: Объединение всех строк списка в одну строку
         * Задача: Используя Stream API, объедините все строки из списка в одну строку, разделяя их пробелом.
         */
        List<String> phrases = Arrays.asList("Java", "Stream", "API");
        String collect = phrases.stream().collect(Collectors.joining(" "));
        System.out.println(collect);

        System.out.println("------- Task 10 -------------");
        /**
         * Задание 10: Маппинг и редукция для получения общей длины строк
         * Задача: Используя Stream API, рассчитайте общую длину всех строк в списке.
         */

        List<String> messages = Arrays.asList("hello", "world", "streams", "are", "cool");
        int totalLength = messages.stream().mapToInt(String::length).sum();
        System.out.println("Общая длина строк: " + totalLength);





    }
}

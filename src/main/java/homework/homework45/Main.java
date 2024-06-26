package homework.homework45;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("************Задание 1**************+");
        /**
         * Задание 1: Вывести все элементы списка
         * Вопрос: Дан список строк. Используйте Stream API для вывода всех элементов списка на экран.
         */
        List<String> items = Arrays.asList("apple","banana","cherry","date","dog");

        items.stream().forEach(System.out::println);

        System.out.println("************Задание 2**************+");
        /**
         * Задание 2: Преобразовать элементы списка в верхний регистр и собрать их в новый список
         * Вопрос: Дан список строк. Преобразуйте все элементы списка в верхний регистр и соберите их в новый список.
         */
        List<String> upperCaseItems = items.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        //Вывод нового списка на экран
        upperCaseItems.forEach(System.out::println);

        System.out.println("************Задание 3**************+");
        /**
         * Задание 3: Найти количество элементов в списке, которые длиннее трех символов
         * Вопрос: Подсчитайте, сколько строк в списке содержат более трех символов
         */

        int count = (int)items.stream()
                .filter(item->item.length()>3)
                .count();

        System.out.println("количество элементов в списке, которые длиннее трех символов: " + count);

        System.out.println("\"************Задание 4**************+\"");
        /**
         * Задание 4: Найти первый элемент, который начинается на "c"
         * Вопрос: Найдите первый элемент в списке, который начинается на букву "c".
         */

        int index = IntStream.range(0, items.size())
                .filter(i->items.get(i).startsWith("c"))
                .findFirst()
                .orElse(-1);

        if(index !=-1){
            System.out.println("Первый элемент в списке, который начинается на букву \"c\": " + (index+1));
        }else{
            System.out.println("Нет элемента, который бы начинался на \"c\"");
        }

        System.out.println("************Задание 5**************+");
        /**
         * Задание 5: Проверить, содержит ли список хотя бы одно отрицательное число
         * Вопрос: Проверьте, содержит ли список целых чисел хотя бы одно отрицательное число.
         */
        List<Integer> numbers = Arrays.asList(-1,2,3,4);

        boolean containsNegativeNumber = numbers.stream()
                .anyMatch(number -> number<0);

        if(containsNegativeNumber){
            System.out.println("Cписок целых чисел содержит хотя бы одно отрицательное число");
        }else{
            System.out.println("список целых чисел не содержит ни одного отрицательного числа");
        }

        System.out.println("************Задание 6**************+");
        /**
         * Задание 6: Отфильтровать и отсортировать список
         * Вопрос: Отфильтруйте список чисел, оставив только четные
         */

        numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number->number%2==0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Отфильтрованных и отсортированный список: " + evenNumbers);


    }
}

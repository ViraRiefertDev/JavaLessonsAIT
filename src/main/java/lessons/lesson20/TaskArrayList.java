package lessons.lesson20;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskArrayList {
    public static void main(String[] args) {
        /*
        Задание
        Создайте ArrayList для строк и добавьте в него следующие элементы:
        "Java", "Python", "C++".
        Выведите содержимое списка на экран.
         */
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        for (String element : languages) {
            System.out.println(element);

        }
        //Вывести на экран без циклов
        System.out.println(languages);


        /*
         **Задание**: Имея `ArrayList` с элементами "Red",
         * "Green", "Blue", "Yellow", удалите "Green" и
         * "Yellow" из списка. Выведите итоговый список на экран.
         */
       ArrayList<String> colors = new ArrayList<>();
       colors.add("Red");
       colors.add("Green");
       colors.add("Blue");
       colors.add("Yellow");
       colors.remove("Green");
       colors.remove("Yellow");
       System.out.println(colors);

       /*
        **Задание**: Дан `ArrayList` с элементами 1, 2, 3, 4, 5.
        * Выведите на экран третий элемент списка.
        */

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers.get(2));

        /*
         **Задание**: Имея `ArrayList` с элементами
         * "Monday", "Tuesday", "Wednesday", замените "Wednesday" на "Sunday".
         * Выведите итоговый список на экран.
         */

        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.set(2,"Sunday");
        System.out.println(days);

        /*
        **Задание**: Создайте `ArrayList` с элементами 4, 1, 3, 5, 2.
          Выведите на экран минимальный и максимальный элементы
         */
        ArrayList<Integer>digits = new ArrayList<>();
        digits.add(4);
        digits.add(1);
        digits.add(3);
        digits.add(5);
        digits.add(2);
        int min = digits.getFirst();
        int max = digits.getFirst();

        for(int digit:digits){
            if(min>=digit){
                min=digit;
            }
            else if(max<=digit){
                max=digit;
            }
        }
        System.out.println("Минимальное значение: "+min);
        System.out.println("Максимальное значение: " + max);

        /*
        Создайте ArrayList с именем "names" и добавьте в него следующие имена: "Alice", "Bob", "Charlie", "David".
        Выведите на экран содержимое списка "names" с использованием цикла for-each.
        Добавьте новое имя "Eva" в конец списка "names".
        Вставьте имя "Frank" на позицию с индексом 2 в списке "names".
        Удалите имя "David" из списка.
        Проверьте, существует ли имя "Charlie" в списке "names", и выведите соответствующее сообщение.
        Очистите список "names" от всех элементов.
         */

        ArrayList<String>names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        for(String name:names){
            System.out.println(name);
        }
        names.add("Eva");
        names.add(2,"Frank");
        names.remove("David");
        System.out.println(names);
        boolean isName=false;
        for(int i=0;i<names.size();i++){
            if(names.get(i).equals("Charlie")){
                System.out.println("Имя Charlie есть в списке, оно находится под индексом " + i);
                isName=true;
            }
        }
        if(!isName){
            System.out.println("Имени Charlie нет в списке!");
        }
        names.clear();

        /*
        1. Создание списка покупок:
            a. Создайте класс Purchase с полями itemName (название товара) и price (цена товара).
            b. Создайте метод main для инициализации ArrayList с покупками и заполните его несколькими товарами.
        2. Добавление новых покупок:
            a. Напишите метод для добавления новой покупки в список. Параметры метода: название товара и его цена.
            b. Проверьте работу метода, добавив несколько новых покупок в список.
        3. Вывод списка покупок:
            a. Напишите метод для вывода всех покупок из списка.
            b. Проверьте работу метода, вызвав его после добавления нескольких покупок.
        4. Поиск покупок:
            a. Напишите метод для поиска покупок по названию товара.
            b. Проверьте работу метода, вызвав его для поиска нескольких товаров.
        5. Удаление покупок:
            a. Напишите метод для удаления покупки по её названию.
            b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.








         */

    }
}

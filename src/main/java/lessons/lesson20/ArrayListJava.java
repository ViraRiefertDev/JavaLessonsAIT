package lessons.lesson20;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //создание arrayList (не имеет стартового жесткого размера как у array
        //Работает с объектами только
        ArrayList<String> list = new ArrayList<>();
        //добавление элементов в лист (никаких индексов указывать не надо)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //сохранение на определенный индекс, на определенную позицию
        //сдвигает все элементы как бусинки вправо (не переписывает и не удаляет элементы)
        list.add(0,"Kiwi");

        //Итерация элементов в листе
        for(String element:list){
            System.out.println(element);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //Итератор безопасная работа с элементами если мы их хотим как то менять
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);

            //Выкинет ошибку ConcurrentModificationException
            //Вы пытаетесь модфицировать элемент который находится в обработке
            //list.add("Test");
            //Тоже ошибку выдает
            //list.remove(0);
            //В итераторе можно только модифицировать элементы
        }


        //Преобразование листа в массив
        String[] array = list.toArray(new String[0]);

        // Удаление элемента. Можно удалять по объекту, а можно по индексу
        // Банан удалился, его позицию занял элемент ниже, элементы сдвинулись
        // Если удаляем последний элемент и индекс его удалится? это не точно!
        list.remove("Banana");
        list.remove("Cherry");

        //Удаление элементов по индексу
        //Киви исчезнет, а яблоко станет на индекс 0
        //list.remove(0);

        //размер листа(оценка количество элементов в листе, а не размер листа по факту)
        int listSize = list.size();
        System.out.println("Количество элементов в листе: " + listSize);
        //Замена элемента в листе в указанной позиции (только по индексу!)
        //На индекс 1 вместо яблока должен быть манго
        //Находит элемент на 1ом индексе и заменяет его на манго, если такого индекса нет в листе вылезет ошибка
        list.set(1,"Mango");

        //Получение элемента из листа на указанной позиции, вернет элемент String, т.к все элементы String
        String element=list.get(0);
        System.out.println(element);

        //Очистить полностью лист. Удаление всех элментов в листе
        list.clear();
        System.out.println(list.size());


    }
}

package lessons.lesson21;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {

    public static void main(String[] args) {
        HashSet<String> hashSetCars = new HashSet<>();
        //Порядок элементов не сохраняется при добавлении, порядок формируется от размера ХЭША
        hashSetCars.add("Audi");
        hashSetCars.add("BMW");
        hashSetCars.add("VW");

        //попытка добавить дубликат,
        //сохраняются лишь уникальные элементы
        hashSetCars.add("Audi");


        //проверка по названию элемента на наличие элемента
        if(hashSetCars.contains("Audi")){
            System.out.println("Найден элемент");

        }

        //удаление элемента
        hashSetCars.remove("VW");

        //Итерация по элементам
        for(String car:hashSetCars){
            System.out.println(car);
        }

        //Выдает ошибку, на лету удалять элменты нельзя
//        for(String car:hashSetCars){
//            if(car.equalsIgnoreCase("Audi")){
//            hashSetCars.remove("Audi");
//        }

        //Удалять элементы можно через итератор
        Iterator<String> iterator = hashSetCars.iterator();
        while(iterator.hasNext()){
            String car = iterator.next();
            if(car.equalsIgnoreCase("Audi")){
                iterator.remove();
                System.out.println("removed!!");
            }
        }

        for(String car:hashSetCars){
            System.out.println(car);
        }


    }
}

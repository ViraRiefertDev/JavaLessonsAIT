package lessons.lesson24;

import java.util.HashMap;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        //добавить объект
        hashMap.put("Audi", "Deutchland");
        hashMap.put("BMW", "Deutchland");
        hashMap.put("Honda", "Japan");
        hashMap.put("Lada", "Russland");



        // Вывести на экран значение по ключу
        System.out.println(hashMap.get("Audi")); //Germany
        hashMap.remove("Honda");

        //проверка есть ли в HashMap определенный ключ или значение
        if(hashMap.containsKey("Audi")){
            System.out.println("Audi was found");
        }
        if(hashMap.containsValue("Deutchland")){
            System.out.println("Deutchland was found");
        }

        System.out.println(hashMap.keySet()); //[Audi, Lada, BMW]
        System.out.println(hashMap.values()); //[Germany, Russia, Germany]
        System.out.println(hashMap.entrySet()); //[Audi=Deutchland, Lada=Russland, BMW=Deutchland]

        hashMap.remove("Audi","Deutchland");
        System.out.println(hashMap.entrySet());


    }
}

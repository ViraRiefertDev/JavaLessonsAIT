package homework.homework22;

import java.util.HashSet;
import java.util.concurrent.Callable;

public class ComparationOfPropertySets {
    public static void main(String[] args) {
        HashSet<Property> set1 = new HashSet<>();
        HashSet<Property> set2 = new HashSet<>();

        //3.2 Создать два HashSet<Property> с разными объектами недвижимости.
        //формируем первый сэт
        Property.addProductInList(set1,"Kölner Landstraße 298 · 40589","Haus");
        Property.addProductInList(set1,"Giesendorfer Straße 22 · 50189 Elsdorf", "Apartment");
        Property.addProductInList(set1,"Willy-Brandt-Platz 3 · 50679 Köln", "Commercial real estate");
        Property.addProductInList(set1, "Schiller Straße 88 · 52064 Aachen", "Haus");


        //Формируем второй сэт
        Property.addProductInList(set2,"Kölner Landstraße 298 · 40589","Haus");
        Property.addProductInList(set2,"Giesendorfer Straße 22 · 50189 Elsdorf", "Apartment");
        Property.addProductInList(set2,"Mühlenstraße,10243", "Commercial real estate");

        //3.4 Продемонстрировать работу метода compareSets, выводя результат на экран.
        HashSet<Property> newSet = Property.compareSets(set1,set2);
        Property.printHashSet(newSet);


    }
}

package homework.homework22;

import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Locale;

public class FilterByPropertyType {
    public static void main(String[] args) {
        Faker faker = new Faker(Locale.GERMAN);
        //Создаем исходный HashSet с различными типами недвижимости
        HashSet<Property> properties = new HashSet<>();
        for(int i=0; i<100; i++){
            Property.addProductInList(properties,faker.address().fullAddress(),Property.randomType());
        }
        //2.3 Продемонстрировать работу метода filterByType выводя результаты фильтрации.
        HashSet<Property> filteredHashSet = Property.filterByType(properties,"Commercial real estate");
        Property.printHashSet(filteredHashSet);

    }
}

package homework.homework22;

import homework.homework20.Purchase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Property {
    //1.1 Создать класс Property с полями address и type.
    private String adress;
    private String type;

    public Property(String adress, String type) {
        this.adress = adress;
        this.type = type;
    }

    public String getAdress() {
        return adress;
    }


    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Property{" +
                "adress='" + adress + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    //1.2 Реализовать hashCode и equals для обеспечения уникальности
    // объектов Property в HashSet на основе их адреса и типа.
    public static void printHashSet(HashSet<Property> list) {
        for (Property object : list) {
            System.out.println("Адрес: " + object.getAdress() + " Type: " + object.getType());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(adress, property.adress) && Objects.equals(type, property.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adress, type);
    }

    //Метод добавления объекта в список
    public static void addProductInList(HashSet<Property> list, String adress, String type) {
        list.add(new Property(adress, type));
    }

    //Метод рандомного типа объекта
    public static String randomType() {
        int number = (int) (Math.random() * 3);
        switch (number) {
            case 0:
                return "Haus";
            case 1:
                return "Apartment";
            case 2:
                return "Commercial real estate";
            default:
                return "No such type";
        }
    }

    //2.2 Написать метод filterByType, который принимает HashSet<Property> и String type,
    // и возвращает HashSet<Property>, содержащий только объекты недвижимости заданного типа.
    public static HashSet<Property> filterByType(HashSet<Property> list, String type) {
        HashSet<Property> filteredList = new HashSet<>();
        if (!type.equalsIgnoreCase("Haus")  && !type.equalsIgnoreCase("Apartment") && !type.equalsIgnoreCase("Commercial real estate")){
            System.out.println("No objects with such type in system!");
        } else {
            for (Property object : list) {
                if (object.getType().equalsIgnoreCase(type)) {
                    filteredList.add(object);
                }
            }
        }
        return filteredList;

    }

    //3.3 Написать метод compareSets, который принимает два HashSet<Property>
    // и возвращает HashSet<Property>, содержащий объекты, которые есть в первом наборе,
    // но отсутствуют во втором.
    public static HashSet<Property> compareSets(HashSet<Property> set1, HashSet<Property> set2){
        HashSet<Property> comparationSet = new HashSet<>();
        for(Property object: set1){
            if(!set2.contains(object)){
                comparationSet.add(object);
            }
        }
        return comparationSet;
    }
}

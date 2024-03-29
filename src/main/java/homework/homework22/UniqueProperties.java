package homework.homework22;

import java.util.HashSet;

public class UniqueProperties {
    public static void main(String[] args) {
        //1.3 Создать HashSet и добавить в него несколько объектов недвижимости, включая дубликаты.
        Property obj1 = new Property("Kölner Landstraße 298 · 40589","Haus");
        Property obj1Duplicate = new Property("Kölner Landstraße 298 · 40589","Haus");
        Property obj2 = new Property("Giesendorfer Straße 22 · 50189 Elsdorf", "Apartment");
        Property LanxessArena = new Property("Willy-Brandt-Platz 3 · 50679 Köln", "Commercial real estate");
        Property LanxessArenaDuplicate = new Property("Willy-Brandt-Platz 3 · 50679 Köln", "Commercial real estate");
        Property EastSideGallery = new Property("Mühlenstraße,10243", "Commercial real estate");

        HashSet<Property> realEstate = new HashSet<>();
        realEstate.add(obj1);
        realEstate.add(obj2);
        realEstate.add(obj1Duplicate);
        realEstate.add(LanxessArena);
        realEstate.add(LanxessArenaDuplicate);
        realEstate.add(EastSideGallery);

        //1.4 Вывести содержимое HashSet на экран, чтобы продемонстрировать,
        // что дубликаты были успешно исключены.
        Property.printHashSet(realEstate);


    }
}

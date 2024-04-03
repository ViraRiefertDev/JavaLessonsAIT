package homework.homework23;

import java.util.HashSet;

//4. Напишите тестовый класс, который создает экземпляр ClothingManager и добавляет в него несколько элементов
//ClothingItem. Попробуйте добавить элементы с одинаковыми и разными характеристиками, чтобы проверить, как
//работает сравнение.
public class ClothingShop {
    public static void main(String[] args) {
        ClothingManager clothingManager = new ClothingManager();
        clothingManager.addNewItem("Dolche&Gabbana Kleid",42,"weiss", "Kleider");
        clothingManager.addNewItem("Dolche&Gabbana Kleid",40,"weiss", "Kleider");
        clothingManager.addNewItem("Dolche&Gabbana Kleid",42,"grün", "Kleider");
        clothingManager.addNewItem("Dolche&Gabbana Kleid",38,"grün", "Kleider");

        clothingManager.addNewItem("Weekend MaxMara", 44,"dunkelblau", "Mäntel");
        clothingManager.addNewItem("Weekend MaxMara", 40,"weiss", "Mäntel");
        clothingManager.addNewItem("Black palms", 36,"dunkelgrau", "Mäntel");
        clothingManager.addNewItem("Black palms", 38,"blau", "Mäntel");

        clothingManager.addNewItem("Burberry", 40, "beige", "Schuhe");
        clothingManager.addNewItem("Balenciage x Crocs", 36,"Schwarz","Schuhe");



        //Проверяем дубликаты
        clothingManager.addNewItem("Dolche&Gabbana Kleid Herbst",42,"grün", "Kleider");
        clothingManager.addNewItem("Dolche&Gabbana Kleid Sommer",38,"grün", "Kleider");
        clothingManager.addNewItem("Weekend MaxSara", 44,"dunkelblau", "Mäntel");
        clothingManager.addNewItem("Bluberry", 40, "beige", "Schuhe");


        clothingManager.printManager();


        //5.Протестируйте поиск и удаление одежды из HashSet, используя различные характеристики. Проверьте,
        // корректно ли работает поиск по характеристикам и удаляется ли одежда правильно.

        //Проверка методов удаления артиклей
        //clothingManager.removeItems("Dolche&Gabbana Kleid");
        //clothingManager.removeItems("Dolche&Gabbana Kleid", 42);
        //clothingManager.removeItems("Weekend MaxMara", 40, "Weiss");
        //clothingManager.removeItemsByCategory("Mäntele");

        //Проверка методов поиска артиклей
        HashSet<ClothingItem> foundItems = new HashSet<>();
//        foundItems = clothingManager.itemSearch("Black palms");
//        foundItems = clothingManager.itemSearch(40);
//        foundItems = clothingManager.itemSearch("Balenciage x Crocs", 36, "schwarz");
//        foundItems = clothingManager.itemSearchByCategory("Schuhe");

//        clothingManager.printManager(foundItems);

        //Проверка методов отсортированного каталога

        //сортировака по размеру
        //clothingManager.sortedBySize();

        //вывод всех уникальных категорий товаров
        //clothingManager.allUniqueCategory();


    }
}

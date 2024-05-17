package homework.homework33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Создать класс ClothingManager:

Поля:
List<ClothingItem> clothingItems - список одежды
Методы:
void addClothingItem(ClothingItem item) - добавляет одежду в коллекцию
boolean removeClothingItem(String name) - удаляет одежду по названию и возвращает true, если удаление прошло успешно, иначе false
List<ClothingItem> findClothingByType(String type) - возвращает список одежды по указанному типу
List<ClothingItem> findClothingBySize(String size) - возвращает список одежды по указанному размеру
ClothingItem findCheapestItem() - возвращает самый дешевый элемент одежды
 */
public class ClothingManager {
    private List<ClothingItem> clothingItems = new ArrayList<>();

    public List<ClothingItem> getClothingItems() {
        return clothingItems;
    }

    //добавляет одежду в коллекцию
    public void addClothingItem(ClothingItem item) {
        clothingItems.add(item);
    }

    //удаляет одежду по названию и возвращает true, если удаление прошло успешно, иначе false
    public boolean removeClothingItem(String name) {
        Iterator<ClothingItem> iterator = clothingItems.iterator();
        while (iterator.hasNext()) {
            ClothingItem item = iterator.next();
            if (item.getName().equals(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    //возвращает список одежды по указанному типу
    public List<ClothingItem> findClothingByType(String type) {
        List<ClothingItem> findedClothingByType = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getType().equals(type)) {
                findedClothingByType.add(item);
            }
        }
        return findedClothingByType;
    }

    //возвращает список одежды по указанному размеру
    public List<ClothingItem> findClothingBySize(String size) {
        List<ClothingItem> findedClothingBySize = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getSize().equals(size)) {
                findedClothingBySize.add(item);
            }
        }
        return findedClothingBySize;
    }

    //возвращает самый дешевый элемент одежды
    public ClothingItem findCheapestItem() {
        if (!clothingItems.isEmpty()) {
            double cheapestprice = clothingItems.getFirst().getPrice();
            ClothingItem cheapestItem = clothingItems.getFirst();
            for (ClothingItem item : clothingItems) {
                if (item.getPrice() < cheapestprice) {
                    cheapestprice = item.getPrice();
                    cheapestItem = item;
                }
            }
            return cheapestItem;
        }
        System.out.println("List is Empty");
        return null;
    }


}

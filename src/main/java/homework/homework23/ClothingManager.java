package homework.homework23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

//3 Разработайте класс ClothingManager, который использует HashSet для управления коллекцией ClothingItem.
// Класс должен иметь методы для добавления, удаления и поиска одежды. Убедитесь, что добавление одинаковых элементов
// (согласно определению в equals()) не допускается.
public class ClothingManager {

    HashSet<ClothingItem> manager = new HashSet<>();

    //Метод для добавления одежды
    public void addNewItem(String name, int size, String color, String category) {
        manager.add(new ClothingItem(name, size, color, category));
    }

    //метод для распечатки любого HashSet
    public static void printManager(HashSet<ClothingItem> set){
        if (set.isEmpty()) {
            System.out.println("-------------------------------------");
            System.out.println("По вашему запросу артиклей не найдено!!!");
        } else {
            for (ClothingItem item : set) {
                System.out.println("-------------------------------------");
                System.out.println("Категория товара: " + item.getCategory());
                System.out.println("Название: " + item.getName());
                System.out.println("Размер:" + item.getSize());
                System.out.println("Цвет: " + item.getColor());
            }
        }
    }

    public static void printCategories(HashSet<String> set){
        System.out.println("-------------------------------------");
        System.out.println("В нашем каталоге Вы можете найти следующие категории товаров: ");
        if (set.isEmpty()) {
            System.out.println("Список пуст, категории товаров отсутствуют!!!");
        } else {
            for (String category : set) {
                System.out.println(category);
            }
        }
    }
    //Метод для распечатки HashSet объекта
    public void printManager() {
        if (manager.isEmpty()) {
            System.out.println("Каталог одежды пуст!!!");
        } else {
            for (ClothingItem item : manager) {
                System.out.println("-------------------------------------");
                System.out.println("Категория товара: " + item.getCategory());
                System.out.println("Название: " + item.getName());
                System.out.println("Размер:" + item.getSize());
                System.out.println("Цвет: " + item.getColor());
            }
        }
    }

    //Метод для распечатки ArrayList
    private void printArrayList(ArrayList<ClothingItem> set){
        if (set.isEmpty()) {
            System.out.println("-------------------------------------");
            System.out.println("Каталог пустой!");
        } else {
            System.out.println("По вашему запросу были найдены следующие артикли: ");
            for (ClothingItem item : set) {
                System.out.println("-------------------------------------");
                System.out.println("Категория товара: " + item.getCategory());
                System.out.println("Название: " + item.getName());
                System.out.println("Размер:" + item.getSize());
                System.out.println("Цвет: " + item.getColor());
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    //Методы для удаления одежды

    //Метод для удаления по имени
    public void removeItems(String name) {
        System.out.println("-------------------------------------");
        if (manager.isEmpty()) {
            System.out.println("Удалять нечего, каталог одежды пуст!");
        } else {
            boolean isFound = false;
            Iterator<ClothingItem> iterator = manager.iterator();
            while (iterator.hasNext()) {
                ClothingItem item = iterator.next();
                if (item.getName().equalsIgnoreCase(name)) {
                    iterator.remove();
                    System.out.println("Артикль " + item.getName() + " в категории " + item.getCategory() + "| Размера: " + item.getSize() + "| Цвета: " + item.getColor() + " был найден и успешно удален!");
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Артикль не найден!");
            }
        }
    }

    //Метод для удаления по имени и размеру
    public void removeItems(String name, int size) {
        System.out.println("-------------------------------------");
        if (manager.isEmpty()) {
            System.out.println("Удалять нечего, каталог одежды пуст!");
        } else {
            boolean isFound = false;
            Iterator<ClothingItem> iterator = manager.iterator();
            while (iterator.hasNext()) {
                ClothingItem item = iterator.next();
                if (item.getName().equalsIgnoreCase(name) && item.getSize() == size) {
                    iterator.remove();
                    System.out.println("Артикль " + item.getName() + " в категории " + item.getCategory() + "| Размера: " + item.getSize() + "| Цвета: " + item.getColor() + " был найден и успешно удален!");
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Артикль не найден!");
            }

        }
    }

    //Метод удаления по имени, размеру и цвету
    public void removeItems(String name, int size, String color) {
        System.out.println("-------------------------------------");
        if (manager.isEmpty()) {
            System.out.println("Удалять нечего, каталог одежды пуст!");
        } else {
            boolean isFound = false;
            Iterator<ClothingItem> iterator = manager.iterator();
            while (iterator.hasNext()) {
                ClothingItem item = iterator.next();
                if (item.getName().equalsIgnoreCase(name) && item.getSize() == size && item.getColor().equalsIgnoreCase(color)) {
                    iterator.remove();
                    System.out.println("Артикль " + item.getName() + " в категории " + item.getCategory() + "| Размера: " + item.getSize() + "| Цвета: " + item.getColor() + " был найден и успешно удален!");
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Артикль не найден!");
            }

        }
    }

    //Метод удаления по категории
    public void removeItemsByCategory(String category) {
        System.out.println("-------------------------------------");
        if (manager.isEmpty()) {
            System.out.println("Удалять нечего, каталог одежды пуст!");
        } else {
            boolean isFound = false;
            Iterator<ClothingItem> iterator = manager.iterator();
            while (iterator.hasNext()) {
                ClothingItem item = iterator.next();
                if (item.getCategory().equalsIgnoreCase(category)) {
                    iterator.remove();
                    System.out.println("Артикль " + item.getName() + " в категории " + item.getCategory() + "| Размера: " + item.getSize() + "| Цвета: " + item.getColor() + " был найден и успешно удален!");
                    isFound = true;
                }
            }
                if (!isFound) {
                    System.out.println("Категория не найдена!");
                }
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    //Методы для поиска одежды
    //Метод поиска по имени
    public HashSet<ClothingItem> itemSearch(String name) {
        System.out.println("-------------------------------------");
        HashSet<ClothingItem> foundItems = new HashSet<>();
        if (manager.isEmpty()) {
            System.out.println("Каталог одежды пуст");
        } else {
            for (ClothingItem item : manager) {
                if (item.getName().equalsIgnoreCase(name)) {
                    foundItems.add(item);
                }
            }
            if (foundItems.isEmpty()) {
                System.out.println("Таких артиклей в каталоге нет!");
            }
        }
        return foundItems;
    }

    //Метод поиска по размеру
    public HashSet<ClothingItem> itemSearch(int size) {
        System.out.println("-------------------------------------");
        HashSet<ClothingItem> foundItems = new HashSet<>();
        if (manager.isEmpty()) {
            System.out.println("Каталог одежды пуст");
        } else {
            for (ClothingItem item : manager) {
                if (item.getSize() == size) {
                    foundItems.add(item);
                }
            }
            if (foundItems.isEmpty()) {
                System.out.println("Таких артиклей в каталоге нет!");
            }
        }
        return foundItems;
    }

    //Метод поиска по имени размеру и цвету
    public HashSet<ClothingItem> itemSearch(String name, int size, String color) {
        System.out.println("-------------------------------------");
        HashSet<ClothingItem> foundItems = new HashSet<>();
        if (manager.isEmpty()) {
            System.out.println("Каталог одежды пуст");
        } else {
            for (ClothingItem item : manager) {
                if (item.getName().equalsIgnoreCase(name) && item.getSize() == size && item.getColor().equalsIgnoreCase(color)) {
                    foundItems.add(item);
                }
            }
            if (foundItems.isEmpty()) {
                System.out.println("Таких артиклей в каталоге нет!");
            }
        }
        return foundItems;
    }

    //Метод поиска по категориям
    public HashSet<ClothingItem> itemSearchByCategory(String category) {
        System.out.println("-------------------------------------");
        HashSet<ClothingItem> foundItems = new HashSet<>();
        if (manager.isEmpty()) {
            System.out.println("Каталог одежды пуст");
        } else {
            for (ClothingItem item : manager) {
                if (item.getCategory().equalsIgnoreCase(category)) {
                    foundItems.add(item);
                }
            }
            if (foundItems.isEmpty()) {
                System.out.println("Такой категории в каталоге не найдено!");
            }
        }
        return foundItems;
    }

    //Дополнительное задание
    //Реализуйте функционал, который позволит выводить содержимое HashSet в отсортированном порядке по одному из
    // атрибутов (например, по размеру или категории).

    //Отсортированный список по размеру
    public void sortedBySize(){
        ArrayList<ClothingItem> list = new ArrayList<>(manager);
        System.out.println("Отстортированный каталог по размеру: ");
        Comparator<ClothingItem> sizeComparator = Comparator.comparingInt(ClothingItem -> ClothingItem.getSize());
        list.sort(sizeComparator);
        printArrayList(list);
    }

    public void sortedByCategory(){
        ArrayList<ClothingItem> list = new ArrayList<>();
        System.out.println("Отсортированный список по категориям");
        HashSet<String> categorySet = allUniqueCategory();
        for(String category: categorySet){
            for(ClothingItem item: manager){
                if(item.getCategory().equalsIgnoreCase(category)){
                    list.add(item);
                }
            }
        }
        printArrayList(list);
    }

    //Дополнительное задание
    //Добавьте в ClothingManager метод для вывода всех уникальных категорий одежды, присутствующих в коллекции.
    public HashSet<String> allUniqueCategory(){
        HashSet<String> categorySet = new HashSet<>();
        for(ClothingItem item : manager){
            categorySet.add(item.getCategory());
        }
        return categorySet;
    }


}

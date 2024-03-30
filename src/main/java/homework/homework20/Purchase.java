package homework.homework20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
------------------------------------------------------------------------------------------------------------------------
1a. Создайте класс Purchase с полями itemName (название товара) и price (цена товара).
 */
public class Purchase {
    private String itemName;
    private double price;

    public Purchase(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "itemName='" + itemName + '\'' +
                ", price=" + price;
    }

    /*
        --------------------------------------------------------------------------------------------------------------------
        2a. Напишите метод для добавления новой покупки в список. Параметры метода: название товара и его цена.
         */
    public static void addProductInList(ArrayList<Purchase> list, String name, double price) {
        list.add(new Purchase(name, price));
    }

    /*
    --------------------------------------------------------------------------------------------------------------------
    3a. Напишите метод для вывода всех покупок из списка
     */
    public static void printArrayList(ArrayList<Purchase> list) {
        if (list.isEmpty()) {
            System.out.println("Лист пустой!");
        } else {
            System.out.println("-------------------------------------------------------------------------------------------");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Element " + (i + 1) + ": " + "itemName='" + list.get(i).itemName + '\'' +
                        ", price='" + list.get(i).price + '\'');
            }
        }
    }

    /*
    --------------------------------------------------------------------------------------------------------------------
     4a. Напишите метод для поиска покупок по названию товара.
     */
    public static int searchByName(ArrayList<Purchase> list, String name) {
        int index = -1;
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getItemName().equals(name)) {
                System.out.println("Покупка " + name + " найдена в списке!");
                System.out.println("Element " + (i + 1) + ": " + "  " + list.get(i).toString());
                index = i;
            }
        }
//
        if (index==-1) {
            System.out.println("Покупка " + name + " в списке отсутствует!");
        }
        return index;
    }
    /*
    --------------------------------------------------------------------------------------------------------------------
    5a. Напишите метод для обновления цены товара по его названию.
     */
    public static void updatePriceByName(ArrayList<Purchase> list, String nameForUpdate, double newPrice){
        boolean isFound = false;
        System.out.println("-------------------------------------------------------------------------------------------");
        for(Purchase object:list){
            if(object.getItemName().equalsIgnoreCase(nameForUpdate)){
                object.setPrice(newPrice);
                isFound=true;
                System.out.println("Цена товара " + object.getItemName() + " обновлена и равна " + object.getPrice()+ " Euro");
            }
        }
        if(!isFound){
            System.out.println("Товар с именем "+ nameForUpdate + " не найден!!!");
        }
    }


    /*
    --------------------------------------------------------------------------------------------------------------------
    6a. Напишите метод для удаления покупки по её названию.
     */
    public static void removeByName(ArrayList<Purchase> list, String name) {
        int index = searchByName(list, name);
        if (index != -1) {
            list.remove(index);
            System.out.println("Покупка удалена!");
        } else {
            System.out.println("Удалять нечего!");
        }

    }

    //метод удаления одинаковых объектов в листе
    public static void removePurchaseByName(ArrayList<Purchase> list, String name){
        System.out.println("Удаляем покупку" + name);
        boolean found = false;
        for(int i=0; i < list.size(); i++){
            if (list.get(i).getItemName().equalsIgnoreCase(name)){
                list.remove(i);
                System.out.println("Покупка найдена и удалена!");
                found=true;
                //Когда удаляем элемент, то все индексы сдвигаеются, надо следить за этим!
                //Если это не учесть то если одинаковые элементы идут один за другим, второй элемент не будет удален!
                i--;
            }
        }
        if(!found){
        System.out.println("Покупка не была найдена найдена!!");}
    }


    public static void removePurchaseByNameIterator(ArrayList<Purchase> purchasesList, Purchase purchaseToDelete){
        Iterator<Purchase> iterator = purchasesList.iterator();
        while (iterator.hasNext()){
            Purchase purchase = iterator.next();
            if(purchase.equals(purchaseToDelete)){
                //удалять объект в листе только так
                //только через метод итератора а не метод листа!
                iterator.remove();
                //а так будет ошибка
                //
                //purchasesList.remove(purchaseToDelete);
                System.out.println("Покупка найдена и удалена итератом");
            }
        }
    }
//    @Override
//    public  int compareTo(Purchase purchase){
//        //return Double.compare(this.price,)
//    }

}



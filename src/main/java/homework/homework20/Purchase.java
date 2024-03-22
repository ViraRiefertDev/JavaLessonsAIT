package homework.homework20;

import java.util.ArrayList;

/*
------------------------------------------------------------------------------------------------------------------------
1a. Создайте класс Purchase с полями itemName (название товара) и price (цена товара).
 */
public class Purchase {
    private String itemName;
    private double price;

    public Purchase(String itemName,double price){
        this.itemName= itemName;
        this.price=price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "itemName='" + itemName + '\'' +
                ", price=" + price;
    }

    /*
        --------------------------------------------------------------------------------------------------------------------
        2a. Напишите метод для добавления новой покупки в список. Параметры метода: название товара и его цена.
         */
    public static void addProductInList(ArrayList<Purchase> list,String name, double price){
        list.add(new Purchase(name,price));
    }

    /*
    --------------------------------------------------------------------------------------------------------------------
    3a. Напишите метод для вывода всех покупок из списка
     */
    public static void printArrayList(ArrayList<Purchase> list){
        System.out.println("-------------------------------------------------------------------------------------------");
        for(int i = 0; i<list.size();i++){
            System.out.println("Element " + (i+1) + ": "+"itemName='" + list.get(i).itemName + '\'' +
                    ", price='" + list.get(i).price + '\'');
        }
    }
    /*
    --------------------------------------------------------------------------------------------------------------------
     4a. Напишите метод для поиска покупок по названию товара.
     */
    public static int searchByName(ArrayList<Purchase> list, String name){
        boolean isInList = false;
        int index=-1;
        System.out.println("-------------------------------------------------------------------------------");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getItemName().equals(name)){
                System.out.println("Покупка " + name + " найдена в списке!");
                 System.out.println("Element : "+ (i+1) + "  "+list.get(i).toString());
                 isInList=true;
                 index=i;
            }
        }
//
         if(!isInList){
             System.out.println("Покупка " + name + " в списке отсутствует!");
         }
         return index;
    }

    /*
    --------------------------------------------------------------------------------------------------------------------
    5a. Напишите метод для удаления покупки по её названию.
     */
    public static void removeByName(ArrayList<Purchase> list, String name){
        int index = searchByName(list,name);
        if(index !=-1){
            list.remove(index);
            System.out.println("Покупка удалена!");
        }
        else {
            System.out.println("Удалять нечего!");
        }

    }
}

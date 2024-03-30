package homework.homework20;

import java.util.ArrayList;
import java.util.Collections;

public class TestPurchase {
    /*
    --------------------------------------------------------------------------------------------------------------------
     1b. Создайте метод main для  инициализации ArrayList с покупками и заполните его несколькими товарами.
     */
    public static void main(String[] args) {
        Purchase obj01 = new Purchase("Milk",2.30);
        Purchase obj02 = new Purchase("Bread",1.23);
        Purchase obj03 = new Purchase("Butter", 2.80);
        ArrayList<Purchase> productList = new ArrayList<>();
        productList.add(obj01);
        productList.add(obj02);
        productList.add(obj03);

        /*
        ----------------------------------------------------------------------------------------------------------------
        2b. Проверьте работу метода, добавив несколько новых покупок в список.
         */
        Purchase.addProductInList(productList, "Apple", 2.30);
        Purchase.addProductInList(productList, "Banana", 1.30);
        Purchase.addProductInList(productList, "Apple", 2.30);
        Purchase.addProductInList(productList, "Eggs", 1.18);
        Purchase.addProductInList(productList, "Chicken", 5.30);

        /*
        ----------------------------------------------------------------------------------------------------------------
         3b. Проверьте работу метода, вызвав его после добавления нескольких покупок.
         */
        Purchase.printArrayList(productList);

        /*
        ----------------------------------------------------------------------------------------------------------------
         4b. Проверьте работу метода, вызвав его для поиска нескольких товаров
         */
        Purchase.searchByName(productList,"Milk");
        Purchase.searchByName(productList,"Eggs");
        Purchase.searchByName(productList,"Ananas");

         /*
        ----------------------------------------------------------------------------------------------------------------
         5b. Проверьте работу метода, обновив цену одного из товаров и выведя список покупок снова.
         */
        Purchase.updatePriceByName(productList,"Chicken", 17.3);
        Purchase.updatePriceByName(productList,"Meat",23);
        Purchase.printArrayList(productList);


        /*
         6b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.
         */
//        Purchase.removeByName(productList, "Apple");
//        Purchase.removeByName(productList,"Eggs");
//        Purchase.removeByName(productList,"Ananas");
//        Purchase.printArrayList(productList);
//
//        Purchase.removePurchaseByNameIterator(productList,obj01);
        Purchase.printArrayList(productList);





    }

}

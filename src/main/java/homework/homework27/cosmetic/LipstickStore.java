package homework.homework27.cosmetic;

import java.util.HashMap;
import java.util.HashSet;

public class LipstickStore extends CosmeticStore{
    //Список помад, которые есть магазине
    private HashMap<String, Lipstick> products;
    //Список популярных брендов помад
    private HashSet<String> popularBrands;

    public LipstickStore(String storeName, String location) {
        super(storeName, location);
        products= new HashMap<>();
        popularBrands = new HashSet<>();
    }


    @Override
    public void describe(){
        super.describe();
        System.out.println("Our store provides a wide range of lipsticks for every taste and budget!");
        System.out.println("The beauty of your lips is in our experienced hands!");
    }

    public void addNewProduct(Lipstick lipstick){
        products.put(lipstick.getProductName(),lipstick);
    }
    public void addPopularBrand(Lipstick lipstick){
        popularBrands.add(lipstick.getBrand());
    }
    public void displayProducts(){
        System.out.println("+++++++++++++++++++++");
        for(Lipstick lipstick:products.values()){
            System.out.println(lipstick);
        }
        System.out.println("+++++++++++++++++++++");
    }
    public void displayPopularBrands(){
        System.out.println("****************");
        for(String brand:popularBrands){
            System.out.println(brand);
        }
        System.out.println("****************");
    }
}

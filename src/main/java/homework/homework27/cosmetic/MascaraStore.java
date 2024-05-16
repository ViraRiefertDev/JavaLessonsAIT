package homework.homework27.cosmetic;

import java.util.HashMap;
import java.util.HashSet;

public class MascaraStore extends CosmeticStore{
    private HashMap<String,Mascara> bestSellers;

    public MascaraStore(String storeName, String location) {
        super(storeName, location);
        bestSellers = new HashMap<>();
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Our store provides a wide range of mascaras for every taste and budget!");
        System.out.println("The beauty of your eyelashes is in our experienced hands!");
    }

    public void addNewBestSeller(Mascara mascara){
        bestSellers.put(mascara.getProductName(),mascara);
    }

    public void displayBestSellers(){
        System.out.println("*******************");
        for(Mascara mascara:bestSellers.values()){
            System.out.println(mascara);
        }
        System.out.println("*******************");
    }
}

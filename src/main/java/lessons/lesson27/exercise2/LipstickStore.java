package lessons.lesson27.exercise2;

import lessons.lesson26.HeadSet;

import java.util.HashSet;

public class LipstickStore extends  CosmeticStore{
    HashSet<Lipstick> popularBrands = new HashSet<>();

    public LipstickStore(String storeName, String location) {
        super(storeName, location);
        popularBrands = new HashSet<>();
    }
    public void displayBrands(){
        for(Lipstick stick:popularBrands){
            System.out.println(stick);
        }
    }
}

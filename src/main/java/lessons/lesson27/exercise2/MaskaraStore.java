package lessons.lesson27.exercise2;

import java.util.HashSet;

public class MaskaraStore extends CosmeticStore{
    HashSet<Mascara> bestSellers;

    public MaskaraStore(String storeName, String location) {
        super(storeName, location);
        bestSellers = new HashSet<>();
    }
}

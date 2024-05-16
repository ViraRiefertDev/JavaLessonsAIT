package homework.homework29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class ArtGallery {
    HashSet<Artwork> collection = new HashSet<>();

    //метод добавления произведение искусства в коллекцию
    public void addNewArtwork(Artwork artwork) {
        if (collection.contains(artwork)) {
            System.out.println("This Artwork is contained in the collection");
        } else {
            boolean isAdded = collection.add(artwork);
            if (isAdded) {
                System.out.println("Artwork was successful added into the collection!");
            } else {
                System.out.println("ERROR! Something is going wrong!");
            }
        }
    }

    //метод удаления произведения искусства из коллекции
    public void removeFromCollection(Artwork artwork) {
        if (collection.contains(artwork)) {
            boolean isRemoved = collection.remove(artwork);
            if (isRemoved) {
                System.out.println("Artwork was successful removed from collection!");
            } else {
                System.out.println("ERROR! Something is going wrong!");
            }
        } else {
            System.out.println("This artwork was not found in collection!");
        }
    }
    //метод поиска произведений искусства по имени художника

    public HashSet<Artwork> foundByCreator(String creator) {
        HashSet<Artwork> foundedArtworks = new HashSet<>();
        for (Artwork artwork : collection) {
            if (artwork.getCreator().equals(creator)) {
                foundedArtworks.add(artwork);
            }
        }
        if (foundedArtworks.isEmpty()) {
            System.out.println("No artworks with creator " + creator + " was found!");
        }
        return foundedArtworks;
    }

    //метод вывода информации всех произведений искусства на экран
    public void displayAllArtworks() {
        if (collection.isEmpty()) {
            System.out.println("null");
        } else {
            for (Artwork artwork : collection) {
                System.out.println("--------------");
                artwork.displayInfo();
                System.out.println("--------------");
            }
        }
    }

    //фильтарция по типу картины скульптуры
    public HashSet<Artwork> filterByArtType(String type) {
        HashSet<Artwork> filteredList = new HashSet<>();
        for (Artwork artwork : collection) {
            if (artwork.getClass().getSimpleName().equals(type)) {
                filteredList.add(artwork);
            }
        }
        if(filteredList.isEmpty()){
            System.out.println("Objects of type " + type + " was not found!");
        }
        else{
            System.out.println("----------------------------------------------");
            System.out.println(filteredList.size() + " objects of type " + type + " was found");
            System.out.println("----------------------------------------------");
        }
        return filteredList;
    }



}

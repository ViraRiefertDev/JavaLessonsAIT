package homework.homework29;

import java.util.ArrayList;
import java.util.HashSet;

public class ArtGalleryTest {
    public static void main(String[] args) {
        Artwork monaLisa = new Painting("Mona Lisa", "Leonardo da Vinci",Paint.OIL,"77x53");
        Artwork theStarryNight = new Painting("The Starry Night", "Vincent van Gogh",Paint.ACRYLIC,"60x60");
        Artwork theScream = new Painting("The Scream", "Edvard Munch", Paint.WATERCOLOR, "80x50");
        Artwork girlWithAPearlEarring = new Painting("Girl With a Pearl Earring","Johannes Vermeer",Paint.TEMPERA,"100x100");

        Artwork david = new Sculpture("David", "Michelangelo", sculptureMaterial.MARBLE,120);
        Artwork ecstasyOfSaintTeresa = new Sculpture("Ecstasy of Saint Teresa", "Gian Lorenzo Bernini", sculptureMaterial.STONE,200);
        Artwork perseusWithTheHeadOfMedusa = new Sculpture("Persus with the Head of Medusa","Antonio Canova", sculptureMaterial.BRONZE,89);

        ArtGallery artGallery = new ArtGallery();
        artGallery.addNewArtwork(monaLisa);
//        artGallery.addNewArtwork(theStarryNight);
        artGallery.addNewArtwork(theScream);
        artGallery.addNewArtwork(girlWithAPearlEarring);
        artGallery.addNewArtwork(david);
        artGallery.addNewArtwork(ecstasyOfSaintTeresa);
        artGallery.addNewArtwork(perseusWithTheHeadOfMedusa);

        artGallery.displayAllArtworks();

        artGallery.removeFromCollection(monaLisa);
        artGallery.removeFromCollection(theStarryNight);

        System.out.println("+++++++++++++++++++++++++++++++++++");
        artGallery.displayAllArtworks();

        //поиск по имени ходожника
        HashSet<Artwork> foundedArts = new HashSet<>();
       foundedArts = artGallery.foundByCreator("Leonardo da Vinci");
       for(Artwork artwork:foundedArts){
            artwork.displayInfo();
        }

        foundedArts = artGallery.foundByCreator("Michelangelo");
         for(Artwork artwork:foundedArts){
            artwork.displayInfo();
         }

         //метод фильтарции по типу
        System.out.println("'''''''''''''''''''''''''''''''''''''");
        HashSet<Artwork> filteredArts = new HashSet<>();
        filteredArts = artGallery.filterByArtType("Sculpture");
        for(Artwork artwork:filteredArts){
            artwork.displayInfo();
            System.out.println("---------------------");
        }

    }

}

package homework.homework33;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ClothingManagerTest {
    private ClothingManager manager;
    private ClothingItem item;
    private ClothingManager managerWithElements;
    private ClothingItem jeans1 = new ClothingItem("3301 SLIM JEANS", "Jeans", "M", 109.95);
    private ClothingItem jeans2 = new ClothingItem("Slim Fit Jeans", "Jeans", "S", 59.99);
    private ClothingItem jeans3 = new ClothingItem("Damen-Jeans mit Wasch-Effekten", "Jeans", "L", 29.99);
    private ClothingItem tShirt1 = new ClothingItem("GIVENCHY - Classic Fit", "T-Shirt", "L", 550);
    private ClothingItem tShirt2 = new ClothingItem("BURGER LOGO", "T-Shirt", "S", 35);
    private ClothingItem tShirt3 = new ClothingItem("BURGER LOGO", "T-Shirt", "M", 8.5);
    private ClothingItem jacke1 = new ClothingItem("Jungen Jacke im College-Look", "Jacket", "S", 39.99);
    private  ClothingItem jacke2 = new ClothingItem("Jacke Jack", "Jacket", "L", 149);
    private  ClothingItem jacke3 = new ClothingItem("Jack & Jones Jacke Elliot", "Jacket", "M", 56.40);



    @BeforeEach
    void setUp(){
        manager = new ClothingManager();
        managerWithElements = new ClothingManager();
        managerWithElements.addClothingItem(jeans1);
        managerWithElements.addClothingItem(jeans2);
        managerWithElements.addClothingItem(jeans3);

        managerWithElements.addClothingItem(tShirt1);
        managerWithElements.addClothingItem(tShirt2);
        managerWithElements.addClothingItem(tShirt3);

        managerWithElements.addClothingItem(jacke1);
        managerWithElements.addClothingItem(jacke2);
        managerWithElements.addClothingItem(jacke3);


    }

    @ParameterizedTest
    @CsvFileSource(resources = "/clothingItems.csv",numLinesToSkip = 1)
    void addClothingItem(String name, String type, String size, double price) {
        item = new ClothingItem(name,type,size,price);
        manager.addClothingItem(item);
        assertEquals(1,manager.getClothingItems().size());
        assertEquals(item, manager.getClothingItems().get(0));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/clothingItems.csv",numLinesToSkip = 1)
    void removeClothingItemSuccess(String name, String type, String size, double price) {
        item = new ClothingItem(name,type,size,price);
        manager.addClothingItem(item);
        assertTrue(manager.removeClothingItem(name));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/clothingItems.csv",numLinesToSkip = 1)
    void removeClothingItemFalse(String name, String type, String size, double price) {
        item = new ClothingItem(name,type,size,price);
        manager.addClothingItem(item);
        assertFalse(manager.removeClothingItem("No Name"));
    }

    @ParameterizedTest
    @ValueSource(strings ={"Jeans", "T-Shirt", "Jacket"})
    void findClothingByTypeSuccess(String type) {
      List<ClothingItem> findedItems =new ArrayList<>();
      findedItems = managerWithElements.findClothingByType(type);
      assertEquals(3, findedItems.size());
      for(ClothingItem item:findedItems){
          assertEquals(type, item.getType());
      }
    }

    @ParameterizedTest
    @ValueSource(strings ={"Shorts", "Pullover", "Jacke"})
    void findClothingByTypeFalse(String type) {
        List<ClothingItem> findedItems =new ArrayList<>();
        findedItems = managerWithElements.findClothingByType(type);
        assertEquals(0, findedItems.size());
        for(ClothingItem item:findedItems){
            assertNotEquals(type, item.getType());

        }
    }

    @ParameterizedTest
    @ValueSource(strings ={"L", "M", "S"})
    void findClothingBySizeSuccess(String size) {
        List<ClothingItem> findedItems = new ArrayList<>();
        findedItems = managerWithElements.findClothingBySize(size);
        assertEquals(3,managerWithElements.findClothingBySize(size).size());
        for(ClothingItem item:findedItems){
            assertEquals(size,item.getSize());
        }
    }

    @ParameterizedTest
    @ValueSource(strings ={"XL", "XS", "XXL"})
    void findClothingBySizeFalse(String size) {
        List<ClothingItem> findedItems = new ArrayList<>();
        findedItems = managerWithElements.findClothingBySize(size);
        assertEquals(0,managerWithElements.findClothingBySize(size).size());
        for(ClothingItem item:findedItems){
            assertNotEquals(size,item.getSize());
        }
    }

    @Test
    void findCheapestItemSuccess() {
        assertEquals(8.5, managerWithElements.findCheapestItem().getPrice());
    }

    @Test
    void findCheapestItemListIsEmpty(){
        ClothingManager manager1 = new ClothingManager();
        assertNull( manager1.findCheapestItem());
    }

    @ParameterizedTest
     @CsvSource({
             "109.95",
             "59.99",
             "29.99",
             "500",
             "35",
             "39.99",
             "149",
            "56.40"
     })
    void findCheapestItemFalse(double price) {
        assertNotEquals(price, managerWithElements.findCheapestItem().getPrice());
    }

}
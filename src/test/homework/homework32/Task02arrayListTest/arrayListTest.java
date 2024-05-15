package homework.homework32.Task02arrayListTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class arrayListTest {
    ArrayList<String> arrayList;

    @BeforeEach
    public void setUp(){
        arrayList = new ArrayList<>();
    }
    @Test
    void CheckElementAddedIntoTheList(){
        assertTrue(arrayList.add("Banana"));
    }

    @Test
    void CheckElementRemovedFromTheList(){
        arrayList.add("Banana");
        assertTrue(arrayList.remove("Banana"));
    }
}

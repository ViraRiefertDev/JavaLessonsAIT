package homework.homework32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task06Test {
    int[] sortedArray;
    @BeforeEach
    void setUp(){
        sortedArray = new int[]{-6,-1,0,8,12};
    }

    @Test
    void arraySortTest() {
        int[] testArray = {-1,8,-6,12,0};
        Task06 task06 = new Task06();
        assertArrayEquals(sortedArray,task06.arraySort(testArray));
    }
}
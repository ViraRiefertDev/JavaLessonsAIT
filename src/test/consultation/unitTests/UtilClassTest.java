package consultation.unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilClassTest {
    UtilClass utilClass;
    @BeforeEach
    void setUp(){
        utilClass = new UtilClass();
    }

    @Test
    void reverseStringTest() {
        assertNotNull(utilClass.reverseString("notebook"));
        assertEquals("koobeton",utilClass.reverseString("notebook"));
    }

    @Test
    void testIsEvenReturnTrue(){
        assertTrue(utilClass.isEven(34));
    }

    @Test
    void testIsEvenReturnFalse(){
        assertTrue(utilClass.isEven(0));
    }

    @Test
    void testIsEvenReturnTrueParamenter0(){
        assertFalse(utilClass.isEven(1));
    }

    @Test
    void findMaxOnlyPositiveNumbers(){
        int[] testArray = {1,5,3,6,8,5};
        assertEquals(8,utilClass.findMax(testArray));
    }
    @Test
    void findMaxOnlyPositiveNumbersNegativeReusult(){
        int[] testArray = {1,5,3,6,8,5};
        assertNotEquals(6,utilClass.findMax(new int[]{1, 2, 4, 5}));
    }

    @Test
    void testfindMaxOnleNegativeNumbers(){
        int[] testArray = {-1,-5,-6,-8,-3};
        assertEquals(-1,utilClass.findMax(testArray));
    }


}
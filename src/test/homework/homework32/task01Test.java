package homework.homework32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task01Test {
    Task01 task01;
    @BeforeEach
    public void setUp(){
        task01 = new Task01();
    }

    @Test
    @DisplayName("Нахождение максимального значения из двух положительных значний")
    void findMaxValueOfTwoPositiveValuesPositive() {
        assertEquals(10,task01.maxValue(5,10));
    }
    @Test
    @DisplayName("Нахождение максимального значения из двух отрицательных значений")
    void findMaxValueOfTwoNegativeValuesPositive(){
        assertEquals(-4,task01.maxValue(-4,-12));
    }

    @Test
    @DisplayName("Нахождение максимального значения из одного положительного и одного отрицательного значения")
    void findMaxValueOfOnePositiveAndOneNegativeValuePositive(){
        assertEquals(1,task01.maxValue(1,-23));
    }

    @Test
    @DisplayName("Нахождение максимального значения из +0 и -0")
    void findMaxValueOfTwoZirosPositive(){
        assertEquals(0,task01.maxValue(0,-0));
    }

}
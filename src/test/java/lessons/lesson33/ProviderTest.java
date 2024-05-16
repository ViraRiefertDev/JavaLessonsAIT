package lessons.lesson33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ProviderTest {

    MaxValue maxValue;

    @BeforeEach
    void setUp(){
        maxValue = new MaxValue();
    }

    @ParameterizedTest
    @MethodSource("lessons.lesson33.Provider#stringProvider")
    void testStringProvider(String argument) {
        assertFalse(argument.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
        "1,1,1",
        "2,3,3",
        "3,5,5"
    })
    void testMaxValue(int a, int b, int expected){
        assertEquals(expected,maxValue.maxValue(a,b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void testMaxValueCsvFile(int a, int b, int expected){
        System.out.println("argument a " + a + " argument b" + b + " expected " + expected);
        assertEquals(expected,maxValue.maxValue(a,b));
    }
}
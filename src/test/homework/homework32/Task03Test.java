package homework.homework32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task03Test {
    Task03 task03;
    @BeforeEach
    public void setUp(){
        task03 = new Task03();
    }
    @Test
    void checkReturnStringInUpperCasePositive() {
        assertEquals("HELLO WORLD", task03.stringUppercase("hello WorLd"));
    }

    @Test
    void checkStringIsEmpty(){

        assertEquals("String is empty", task03.stringUppercase(""));
    }

    @Test
    void checkIfStringIsNull(){
       assertNull(task03.stringUppercase(null), "String is null");
    }


}
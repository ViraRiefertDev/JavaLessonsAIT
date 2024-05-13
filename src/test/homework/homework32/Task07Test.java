package homework.homework32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task07Test {
    Task07 task07;

    @BeforeEach
    void setUp(){
        task07 = new Task07();
    }

    @Test
    void helloNameTestOlga() {

        assertEquals("Hello, Olga!",task07.helloName("Olga"));
    }

    @Test
    void helloNameTestSveta() {

        assertEquals("Hello, Sveta!",task07.helloName("Sveta"));
    }

    @Test
    void helloNameTestSedrik() {

        assertEquals("Hello, Sedrik!",task07.helloName("Sedrik"));
    }
}
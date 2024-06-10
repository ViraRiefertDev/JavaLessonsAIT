package homework.homework39;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void testDifferenceDaysPositive() {
        LocalDate localDateNow = LocalDate.of(2024,06,10);
//        LocalDate localDateNow = LocalDate.now();
        //метод .now() не использовать в тесте, потому что завтра тест посыпится!
        LocalDate lastBirthday = LocalDate.of(2020,6,6);
        assertEquals(1465,Tasks.differenceDays(lastBirthday,localDateNow));
    }

    @Test
    void testDifferenceDaysThrows() {
        LocalDate localDateNow = null;
        LocalDate lastBirthday = LocalDate.of(2020,6,6);
        assertThrows(IllegalArgumentException.class, ()->{
            Tasks.differenceDays(lastBirthday,localDateNow);
        });
    }
}
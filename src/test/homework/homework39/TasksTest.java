package homework.homework39;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void testDifferenceDaysPositive() {
        //метод .now() не использовать в тесте, потому что завтра тест посыпится!
        LocalDate localDateNow = LocalDate.now();
        LocalDate lastBirthday = LocalDate.of(2020,6,6);
        assertEquals(1461,Tasks.differenceDays(lastBirthday,localDateNow));

    }
}
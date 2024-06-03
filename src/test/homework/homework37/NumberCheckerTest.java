package homework.homework37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.org.lidalia.slf4jext.Level;
import uk.org.lidalia.slf4jtest.LoggingEvent;
import uk.org.lidalia.slf4jtest.TestLogger;
import uk.org.lidalia.slf4jtest.TestLoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    private TestLogger testLogger;

    @BeforeEach
    public void setUp(){
        //инициализируем логгер и указываем с какого класса мы будем тащить наши логи
        testLogger = TestLoggerFactory.getTestLogger(NumberChecker.class);
        testLogger.clear();
    }
    @Test
    void testValidNumberInLogger() {
        NumberChecker numberChecker = new NumberChecker();
        numberChecker.checkNumber("123");
        List<LoggingEvent> loggingEvents = testLogger.getLoggingEvents();
        //смотрит сколько строк уходит в лог
        assertEquals(2, loggingEvents.size());

        //assertEquals(2,loggingEvents.get(0).getLevel().equals(Level.INFO));

    }
}
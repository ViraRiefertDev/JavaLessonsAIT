package homework.homework34;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WeatherMonitoringTest {

    //Тестирование метода расчёта средней температуры:
    //Используйте @ParameterizedTest с @MethodSource для подачи списков температур и ожидаемых средних значений.
    //Метод источник данных для теста temperatureProvider
    static Stream<Arguments> temperatureProvider(){
        return Stream.of(
                Arguments.of(Arrays.asList(15.0, 21.5, 33.8, 42.0,12.1), ((15.0+21.5+33.8+42.0+12.1)/5)),
                Arguments.of(Arrays.asList(0.0, 12.5, 9.5, 18.0,32.3), ((0.0+12.5+9.5+18.0+32.3)/5)),
                Arguments.of(Arrays.asList(12.0,12.0,12.0,12.0,12.0),12.0),
                Arguments.of(Arrays.asList(-20.0,0.0,20.0,0.0),0.0),
                Arguments.of(Arrays.asList(25.0,30.0,35.0),30.0)
        );
    }


    //тест проверяет, что метод возвращает правильную среднюю температуру
    @ParameterizedTest
    @MethodSource("temperatureProvider")
    void calculateAverageTemperature(List<Double> temperatures,double expectedAverage) {
        double actualAverage = WeatherMonitoring.calculateAverageTemperature(temperatures);
        assertEquals(expectedAverage,actualAverage, 0.01);
    }


    //Метод источник данных для теста CalculateAverageTemperatureListIsNullOrEmpty
    //Возвращает поток аргументов Stream<Arguments>, где каждый аргумент представляет собой некорректный список
    // температур (null или пустой список).
    static Stream<Arguments> invalidTemperatureProvider(){
        return Stream.of(
                Arguments.of((List<Double>) null),
                //List.of создает пустой список List
                Arguments.of(List.of())
        );
    }

    //тест проверяет, что метод calculateAverageTemperature выбрасывает IllegalArgumentException при передаче null
    // или пустого списка.
    @ParameterizedTest
    @MethodSource("invalidTemperatureProvider")
    void CalculateAverageTemperatureWithInvalidInput(List<Double> temperatures){
        assertThrows(IllegalArgumentException.class,()->{
            WeatherMonitoring.calculateAverageTemperature(temperatures);
        });
    }



    //----------------------------------------------------------
    //Тестирование метода проверки предупреждений о заморозках:
    //Используйте @ParameterizedTest с @ValueSource или @CsvSource для предоставления различных температурных данных
    // и ожидаемых результатов.



    //тест проверяет, возвращает ли метод правильный результат для одиночного значения температуры
    @ParameterizedTest
    @ValueSource(doubles = {1.0,-1.0, 0.0,-10.5, 25.0, -0.1})
    void checkForFrostWarningsForSingleTemperatureValue(double temperature) {
        //@ValueSource не поддерживает списки напрямую. Однако мы можем использовать массивы и затем преобразовывать
        // их в списки в тестовом методе.
        List<Double> temperatures = List.of(temperature);
        boolean expected = temperature<0;
        boolean actual = WeatherMonitoring.checkForFrostWarnings(temperatures);
        assertEquals(expected,actual);
    }

    //тест проверяет, возвращает ли метод правильных результат для списка из нескольких значений температуры
    @ParameterizedTest
    @CsvSource({
            "1.0, 0.5, 2.0, false",
            "-1.0, 0.5, 2.0, true",
            "0.0, 0.0, 0.0, false",
            "-10.5, -5.5, 3.0, true",
            "25.0, 30.0, 15.0, false",
            "0.1, -0.1, 0.2, true"
    })

    void CheckForFrostWarningListWithManyValues(double temperature1, double temperature2, double temperature3, boolean expected){
        List<Double> tempList = List.of(temperature1, temperature2, temperature3);
        boolean actual = WeatherMonitoring.checkForFrostWarnings(tempList);
        assertEquals(expected, actual);
    }

    //тест проверяет проверяет, выбрасывается ли исключение IllegalArgumentException, если передан пустой список.
    @Test
    void CheckForFrostWarningsWithEmptyList(){
        List<Double> temperatures = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> {
            WeatherMonitoring.checkForFrostWarnings(temperatures);
        });
    }

    //тест проверяет, выбрасывается ли исключение IllegalArgumentException, если передан null.
    @Test
    void CheckForFrostWarningsWithNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            WeatherMonitoring.checkForFrostWarnings(null);
        });
    }


    //----------------------------------------------------------
    //Тестирование метода оценки уровня осадков:
    //Создайте параметризированные тесты, используя @CsvSource для подачи списков уровней осадков и ожидаемых
    //классификаций.


    ////тест проверяет, возвращает ли метод правильных результат для списка из нескольких значений уровня осадков
    @ParameterizedTest
    @CsvSource({
            "10.0, 50.0, 70.0, LOW",
            "100.0, 150.0, 170, MEDIUM",
            "200.0, 300.0, 234.0, HIGH"
    })
    void  testEvaluatePrecipitationLevels(double precipitation1,double precipitation2,double precipitation3, PercipitationLevel expectedLevel){
        List<Double> Precipitation = List.of(precipitation1,precipitation2,precipitation3);
        PercipitationLevel actualLevel = WeatherMonitoring.evaluatePrecipitationLevels(Precipitation);
        assertEquals(expectedLevel,actualLevel);
    }

    //тест проверяет проверяет, выбрасывается ли исключение IllegalArgumentException, если передан пустой список.
    @Test
    void testEvaluatePrecipitationLevelsWithEmptyList(){
        List<Double> precipitations = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> {
            WeatherMonitoring.evaluatePrecipitationLevels(precipitations);
        });
    }

    //тест проверяет, выбрасывается ли исключение IllegalArgumentException, если передан null.
    @Test
    void testEvaluatePrecipitationLevelsWithNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            WeatherMonitoring.evaluatePrecipitationLevels(null);
        });
    }


}
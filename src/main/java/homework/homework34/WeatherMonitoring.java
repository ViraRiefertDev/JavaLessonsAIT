package homework.homework34;

import java.util.Arrays;
import java.util.List;

public class WeatherMonitoring {

    //метод расчёта средней температуры
    //метод принимает список значений температур и возвращает их среднее значение
    public static double calculateAverageTemperature(List<Double> temperatureList) {

        if (temperatureList == null || temperatureList.isEmpty()) {
            throw new IllegalArgumentException("The temperature list cannot be null or empty");
        }

        double sum = 0;
        for (double temperature : temperatureList) {
            sum += temperature;
        }
        return sum / temperatureList.size();

    }

    //метод проверки предупреждений о заморозках
    //метод принимает список температур и возвращает true, если хотя бы одна из температур ниже 0
    public static boolean checkForFrostWarnings(List<Double> temperatureList) {
        if (temperatureList == null || temperatureList.isEmpty()) {
            throw new IllegalArgumentException("список температур не может быть null или пустым!");
        }

        for (double temperature : temperatureList) {
            if (temperature < 0) {
                return true;
            }
        }
        return false;
    }

    //метод оценки уровня осадков
    //метод принимает список значений осадков и классифицирует их как "низкий", "средний", "Высокий"
    public static PercipitationLevel evaluatePrecipitationLevels(List<Double> precipitationLevels) {
        if (precipitationLevels == null || precipitationLevels.isEmpty()) {
            throw new IllegalArgumentException("Список уровней осадков не может быть null или пустым");
        }
        double sum = 0;
        for (double precipitation : precipitationLevels) {
            sum += precipitation;
        }
        double average = sum/precipitationLevels.size();
        if (average >= 200) {
            return PercipitationLevel.HIGH;
        } else if (average >= 100) {
            return PercipitationLevel.MEDIUM;
        } else {
            return PercipitationLevel.LOW;
        }
    }


}

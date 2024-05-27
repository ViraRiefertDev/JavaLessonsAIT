package homework.homework34;

import java.util.List;

public enum TestEvaluatePrecipitationLevelsValues {

    TEST_LOW(List.of(10.0, 50.0, 70.0),PercipitationLevel.LOW),
    TEST_MEDIUM(List.of(100.0, 150.0, 170.0),PercipitationLevel.MEDIUM),
    TEST_HIGH(List.of(200.0, 300.0, 234.0),PercipitationLevel.HIGH);




    private final List<Double> Precipitation;
    private final PercipitationLevel level;

    TestEvaluatePrecipitationLevelsValues(List<Double> precipitation, PercipitationLevel level) {
        Precipitation = precipitation;
        this.level = level;
    }

    public List<Double> getPrecipitation() {
        return Precipitation;
    }

    public PercipitationLevel getLevel() {
        return level;
    }
}

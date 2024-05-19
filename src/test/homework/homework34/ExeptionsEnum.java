package homework.homework34;

import java.util.ArrayList;
import java.util.List;

public enum ExeptionsEnum {
    TEST_EMPTY(new ArrayList<>()),
    TEST_NULL(null)



    ;
    private final List<Double> temperatures;

    ExeptionsEnum(List<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public List<Double> getTemperatures() {
        return temperatures;
    }
}

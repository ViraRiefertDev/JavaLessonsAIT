package homework.homework34;

import java.util.List;

public enum CheckForFrostWarningValues {
    TEST1(List.of(1.0, 0.5, 2.0),false),
    TEST2(List.of(-1.0, 0.5, 2.0),true),
    TEST3(List.of(0.0, 0.0, 0.0),false),
    TEST4(List.of(-10.5, -5.5, 3.0),true),
    TEST5(List.of(25.0, 30.0, 15.0),false),
    TEST6(List.of(0.1, -0.1, 0.2),true);


    private final List<Double> tempList;
    private final boolean expected;

    CheckForFrostWarningValues(List<Double> tempList, boolean expected) {
        this.tempList = tempList;
        this.expected = expected;
    }

    public List<Double> getTempList() {
        return tempList;
    }

    public boolean isExpected() {
        return expected;
    }
}

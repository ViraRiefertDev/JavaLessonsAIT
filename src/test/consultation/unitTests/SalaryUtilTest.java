package consultation.unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SalaryUtilTest {

    private SalaryUtil salaryUtil;
    @BeforeEach
    public void setUp(){
        salaryUtil = new SalaryUtil();
    }

    @Test
    void testBruttoSalaryLess_2000(){
        assertEquals(1500,salaryUtil.getNettoSalary(1500));
    }

    @Test
    void testBruttoSalaryMore_5000(){
        assertEquals(8500,salaryUtil.getNettoSalary(10000));
    }

    //можно прописать некую шапку
    @ParameterizedTest(name ="{index} ==> BRUTTO_SALARY: {0} - NETTO_SALARY {1}")
    @CsvFileSource(resources = "/salary.csv", numLinesToSkip = 1)
    void testBruttoSalaryCsvFile(double bruttoSalary, double expectedNettoSalary){
        assertEquals(expectedNettoSalary,salaryUtil.getNettoSalary(bruttoSalary));
    }

    @ParameterizedTest(name ="{index} ==> BRUTTO_SALARY: {0} - NETTO_SALARY {1}")
    @CsvSource({
            "1000,   1000",
            "2500,   2375",
            "4200,   3780",
            "7000,   5950",
    })
    void testBruttoSalaryCsvSource(double bruttoSalary, double expectedNettoSalary){
        assertEquals(expectedNettoSalary,salaryUtil.getNettoSalary(bruttoSalary));
    }


    //Продвинутый тест через enum
    //используем enum как источник тестовых данных
    @ParameterizedTest
    @EnumSource(TestBrutooNettoSalary.class)
    void testBruttoSalaryEnumTest(TestBrutooNettoSalary testEnum){
        assertEquals(testEnum.getExpectedNetto(),salaryUtil.getNettoSalary(testEnum.getBrutto()));
    }

    //Продвинутый тест через @ValueSource и в Map хранить значения,
    // и в тесте дергать ключ значения и сверяться
    @ParameterizedTest
    @ValueSource(doubles = {1000, 2500, 4200,7000})
    void testBruttoSalaryVealueSource(double bruttoSalary){
        Map<Double, Double> expectedSalary = new HashMap<>();
        expectedSalary.put(1000.0, 1000.0);
        expectedSalary.put(2500.0, 2375.0);
        expectedSalary.put(4200.0, 3780.0);
        expectedSalary.put(7000.0, 5950.0);
        assertEquals(expectedSalary.get(bruttoSalary), salaryUtil.getNettoSalary(bruttoSalary));
    }

}
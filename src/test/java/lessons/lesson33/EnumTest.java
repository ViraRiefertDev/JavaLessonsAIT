package lessons.lesson33;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

public class EnumTest {
    @ParameterizedTest
    @EnumSource(Season.class)
    void testEnumSeason(Season season){
        assertNotNull(season);
    }

}

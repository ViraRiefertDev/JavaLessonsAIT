package lesson33;


import lessons.lesson33.Palindorm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindormTest {
    private Palindorm palindorm;
    @BeforeEach
    void setUp(){
        palindorm = new Palindorm();
    }

    @ParameterizedTest
    @ValueSource(strings = {"radar", "level"})
    void testIsPalindromeSuccess(String input){
       assertTrue(palindorm.isPalindrome(input));

    }

    @ParameterizedTest
    @ValueSource(strings = {"auto", "heandy","computer"})
    void testIsPalindromeFalse(String input){
        assertFalse(palindorm.isPalindrome(input));

    }

}

package lessons.lesson38.homework38;

import exceptions.InsufficientFundsException2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount(0,"1234567890");
    }

    @Test
    void testBanlanceAddAmountPositive(){
        bankAccount.deposit(1000);
        assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    void testBalanceAddAmountNegative(){

        assertThrows(IllegalArgumentException.class,()->{
            bankAccount.deposit(-1000);
        });
    }

    @Test
    void testBalanceAddAmountNegativeThrowsException(){

        assertThrows(InsufficientFundsException2.class,()->{
            bankAccount.withdraw(10200);
        });
    }

    @Test
    void testBalanceWithdrawNegativeThrowsException(){

        assertThrows(IllegalArgumentException.class,()->{
            bankAccount.withdraw(-1000);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/deposite.csv",numLinesToSkip = 1)
    void testBalanceAddAmountFromCSV(double amount, double expectedBanalce){
        bankAccount.deposit(amount);
        assertEquals(expectedBanalce,bankAccount.getBalance());
    }

    //Проверка конструктора на исключение входящих чисел
    @ParameterizedTest
    @ValueSource(strings = {"123456789P", "l234567890", "123456789l"})
    void testBankAccountConstructorException(String input) {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(0,input);
        });
    }

    //Проверка валидации банковского номера позитивные номера
    @ParameterizedTest
    @ValueSource(strings = {"1679584603", "8527419630", "6402793825"})
    void testisBankAccountValidPositive(String input) {
        assertTrue(bankAccount.isBankAccountValid(input));
    }
    //Проверка валидации банковского номера негативные номера
    @ParameterizedTest
    @ValueSource(strings = {"167603", "85274AA19630", "64027938LGE25"})
    void testisBankAccountValidNegative(String input) {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(0,input);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/withdraw.csv",numLinesToSkip = 1)
    void testBalancewithdrawFromCSV(double amount, double expectedBanalce) throws InsufficientFundsException2 {
        bankAccount.deposit(1000);
        bankAccount.withdraw(amount);
        assertEquals(expectedBanalce,bankAccount.getBalance());
    }





}
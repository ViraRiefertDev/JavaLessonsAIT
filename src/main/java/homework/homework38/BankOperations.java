package homework.homework38;

import exceptions.InsufficientFundsException;
import homework.homework37.NumberChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.image.LookupOp;

public class BankOperations {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankOperations.class);
    public static void main(String[] args) {
        try {
            BankAccount bankAccount = new BankAccount(200,"1234567890");
            bankAccount.deposit(-23.3);
            bankAccount.withdraw(240);
        }catch (IllegalArgumentException exception){
            LOGGER.error(exception.getMessage());
        }
        catch (InsufficientFundsException exception){
            LOGGER.error(exception.toString());
        }
        finally {
            LOGGER.info("Operation is completed!");
        }
    }
}

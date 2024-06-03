package homework.homework38;

import exceptions.InsufficientFundsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        if(accountNumber.length()==10){
            try{
                int result = Integer.parseInt(accountNumber);
                LOGGER.info("accountNumber is valid!");
            }catch(NumberFormatException exception){
                LOGGER.error("accoundNumber is invalid!");
                LOGGER.error(exception.getMessage());
                throw new IllegalArgumentException("Invalid number: " + accountNumber);
            }
        }else{
            LOGGER.error("accoundNumber is too short!");
            throw new IllegalArgumentException("Invalid number: " + accountNumber);
        }
        this.accountNumber = accountNumber;
        LOGGER.info("Bank account was created!");
    }

    public void deposit(double amount){
        if(amount<0){
            LOGGER.error("amount is negative!");
            throw new IllegalArgumentException("Amount cant be negative!");
        }
        else{
            LOGGER.info("balance was increas in " + amount + " Euro. Balance: " +balance );
            balance+=amount;
        }
    }

    public void withdraw(double amount)throws InsufficientFundsException{
        if(balance>=amount){
            LOGGER.info(amount +" Euros added to the account, current accoutn balance is: " + balance);
            balance-=amount;
        }
        else{
            LOGGER.error("Not enough money! " + (amount-balance) + " Euros missing");
            throw new InsufficientFundsException(amount-balance);
        }
    }
}

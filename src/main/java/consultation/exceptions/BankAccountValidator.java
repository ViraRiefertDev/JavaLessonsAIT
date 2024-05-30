package consultation.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

    public class BankAccountValidator {

        private static final Logger LOGGER = LoggerFactory.getLogger(BankAccountValidator.class);


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your bank account number: ");
            String accountNumber = scanner.nextLine();

            isBankAccountValid(accountNumber);
        }

        public static boolean isBankAccountValid(String accountNumber) {
            LOGGER.info("Validiere Bank account {}", accountNumber);
            accountNumber = accountNumber.trim();
            if(accountNumber.length() != 10){
                LOGGER.error("Length ist wrong: {} ", accountNumber);
                return false;
            }
            for(int i = 0; i < accountNumber.length(); i++){
                if(!Character.isDigit(accountNumber.charAt(i))){
                    LOGGER.error("Character {} ist wrong: {} ", accountNumber.charAt(i), accountNumber);
                    return false;
                }
            }
            LOGGER.info("Bank account {} is valid", accountNumber);
            return true;
        }
    }



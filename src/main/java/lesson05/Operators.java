package lesson05;

import org.w3c.dom.ls.LSOutput;

public class Operators {

    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 10;
        //Оператор равенства ==
        boolean isEqual = (numberOne == numberTwo);
        System.out.println(isEqual);

        int numberThree = 50;
        int numberFour = 60;
        //Оператор неравнества !=
        System.out.println(numberThree != numberFour);

        //Оператор >
        System.out.println(numberThree > numberFour);

        //Оператор <
        System.out.println(numberThree < numberFour);

        // Оператор больше или равно
        System.out.println(numberOne >= numberTwo);

        //Оператор меньше или равно
        System.out.println(numberOne <= numberTwo);

        String nameOne = "Mustermann ";
        String nameTwo = "Mustermann";
        System.out.println("Is names Equals? " + nameOne.equals(nameTwo));

        /*
        AND &&
        false && false --> false
        false && true  --> false
        true  && false --> false
        true  && true  --> true
         */

        /*
        OR ||
        false || false --> false
        false || true  --> true
        true  || false --> true
        true  || true  --> true
         */

        int age = 20;
        int salary = 10000;
        boolean hasPass = true;

        boolean hasCredit;

        if (age >= 21 && salary >= 2000)
            hasCredit = true;

        else
            hasCredit = false;
        System.out.println("Credit: " + hasCredit);
        //Bank2
        if (age >= 21 || salary > 3000)
            hasCredit = true;
        else
            hasCredit = false;

        System.out.println("Credit2: " + hasCredit);

        //Задачки

        int numberA = 40;
        int numberB = 20;
        boolean result=false;
        if(numberA > 10 || numberB > 15) //false || true -->true
            result=true;
        if(numberA > 10 && numberB > 15) //false && true -->false
            result=false;
        System.out.println("CheckResult--> "+result);

        double accountBalance = 5000.0;
        boolean accountActive = true;
        //Сумма для снятия
        double amountToWithdraw = 6000.0;
        boolean transactionSuccess = false;
        if(accountActive && accountBalance >=amountToWithdraw){
            accountBalance = accountBalance-amountToWithdraw;
            transactionSuccess = true;
            System.out.println("Transaction: " + transactionSuccess + " Balance: " + accountBalance);
        }
        else System.out.println("ERROR!!! " + transactionSuccess);

    }

}

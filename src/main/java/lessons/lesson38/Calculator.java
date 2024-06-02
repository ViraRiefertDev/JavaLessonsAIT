package lessons.lesson38;

public class Calculator {

    public int divide(int divident, int divisor){
        if(divisor==0){
            throw new ArithmeticException();
        }
        else {
            return divident/divisor;
        }
    }
}

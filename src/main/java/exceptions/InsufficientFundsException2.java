package exceptions;

public class InsufficientFundsException2 extends Exception{
    private double shortage;

    public InsufficientFundsException2(double shortage) {
        super("You dont have enough maney to perform this operation: " + shortage);
        this.shortage = shortage;
    }
}

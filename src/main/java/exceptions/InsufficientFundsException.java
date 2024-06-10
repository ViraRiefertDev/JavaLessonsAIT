package exceptions;

public class InsufficientFundsException extends Exception{
    //показывает, насколько средств не хватает для выполнения операции.
    private double shortage;

    public InsufficientFundsException(double shortage) {
        this.shortage = shortage;
    }

    public String toString(){
        return "There are not enough funds in the accoutn, " + shortage + " Euro is missing";
    }
}

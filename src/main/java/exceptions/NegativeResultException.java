package exceptions;

class NegativeResultException extends RuntimeException{
    public NegativeResultException(){
        super("There are no numbers below zero!");
    }
}

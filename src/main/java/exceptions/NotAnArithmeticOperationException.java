package exceptions;

class NotAnArithmeticOperationException extends RuntimeException{
    public NotAnArithmeticOperationException(){
        super("This line doesn't contain any math!");
    }
}

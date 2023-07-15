package exceptions;

class MultipleArithmeticOperationException extends RuntimeException{
    public MultipleArithmeticOperationException(){
        super("The calculator performs only one operation at a time!");
    }
}

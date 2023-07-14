package validator;

public class SignValidator {
    public boolean isPlus(String sign){
        return sign.matches("\\+");
    }
    public boolean isMinus(String sign){
        return sign.matches("-");
    }
    public boolean isMultiplicationSign(String sign){
        return sign.matches("\\*");
    }
    public boolean isDivisionSign(String sign){
        return sign.matches("/");
    }
}

package validator;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StringValidator {
   public boolean isValidArithmeticOperationArabic(String mathProblem){
        return mathProblem.matches("\\d+\\s{1} [+-/*]{1}\\s{1}\\d+");
    }
    public boolean isValidArithmeticOperationRoman(String mathProblem){
        return mathProblem.matches("");
    }

    public boolean hasArabicAndRomanNumbers(String mathProblem){
       return mathProblem.contains("[0-9IVXLCDM]+");
    }
    public boolean hasMultimpleArithmeticOperations(String mathProblem){
       return mathProblem.contains("");
    }
}

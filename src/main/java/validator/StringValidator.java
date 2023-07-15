package validator;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class StringValidator {
    public static final String VALID_ARABIC_OPERATION = "\\d+\\s{1} [+-/*]{1}\\s{1}\\d+";
    public static final String VALID_ROMAN_OPERATION = "[VXLCDM]+\\s{1}[+-/*]{1}\\s{1}[VXLCDM]+";
    public static final String MIXED_OPERATION = "[0-9IVXLCDM]+";

    public boolean isValidArithmeticOperationArabic(String mathProblem) {
        return mathProblem.matches(VALID_ARABIC_OPERATION);
    }

    public boolean isValidArithmeticOperationRoman(String mathProblem) {
        return mathProblem.matches(VALID_ROMAN_OPERATION);
    }

    public boolean hasArabicAndRomanNumbers(String mathProblem) {
        return mathProblem.contains(MIXED_OPERATION);
    }

    public boolean hasMultimpleArithmeticOperations(String mathProblem) {
        return (mathProblem.contains("+") ||
                mathProblem.contains("-") || mathProblem.contains("*") ||
                mathProblem.contains("/"))
                && mathProblem.split(" ").length != 3;
    }
}

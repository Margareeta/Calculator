package validator;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StringValidator {
    public static final String VALID_ARABIC_EXPRESSION = "\\d{1,2}\\s[+-/*]\\s\\d{1,2}";
    public static final String VALID_ROMAN_EXPRESSION = "[VXLCDM]+\\s[+-/*]\\s[VXLCDM]+";
    public static final String MIXED_EXPRESSION = "[0-9IVXLCDM]+";

    public  static boolean isValidArabicMathExpression(String input) {
        return input.matches(VALID_ARABIC_EXPRESSION);
    }

    public static boolean isValidRomanMathExpression(String input) {
        return input.matches(VALID_ROMAN_EXPRESSION);
    }

    public static boolean hasArabicAndRomanNumbers(String input) {
        return input.contains(MIXED_EXPRESSION);
    }

    public static boolean hasMultimpleCalculations(String input) {
        return (input.contains("+") ||
                input.contains("-") || input.contains("*") ||
                input.contains("/"))
                && input.split(" ").length != 3;
    }
}

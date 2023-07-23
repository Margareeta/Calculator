package calculator;

class StringValidator {
    public static final String VALID_ARABIC_EXPRESSION = "\\d{1,2}\\s[-\\+\\*\\/]\\s\\d{1,2}";
    public static final String VALID_ROMAN_EXPRESSION = "[IVX]{1,4}\\s[-+*/]\\s[IVX]{1,4}";
    public static final String MIXED_EXPRESSION = "[0-9IVX]+";

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
        return input.split(" ").length != 3;

    }
}

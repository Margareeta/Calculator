package calculator;

public class ArabicCalculator {
    private String[] numbersAndSign(String input) {
        return input.split(" ");
    }

    private int[] parseArabic(String input) {
        String[] numbersAndSign = numbersAndSign(input);
        int[] res = new int[2];
               try {
            res[0] = Integer.parseInt(numbersAndSign[0]);
            res[1] = Integer.parseInt(numbersAndSign[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Arabic and Roman numbers do not come together!");
        }
        return res;
    }

    String calcArabic(String input) {
        int i, j;
        String[] numbersAndSign = numbersAndSign(input);
        int[] parseArabic = parseArabic(input);
        i = parseArabic[0];
        j = parseArabic[1];
        String sign = numbersAndSign[1];
        switch (sign) {
            case ("+") -> {
                return String.valueOf(i + j);
            }
            case ("-") -> {
                return String.valueOf(i - j);
            }
            case ("*") -> {
                return String.valueOf(i * j);
            }
            case ("/") -> {
                return String.valueOf(i / j);
            }
        }
        return "";
    }
}

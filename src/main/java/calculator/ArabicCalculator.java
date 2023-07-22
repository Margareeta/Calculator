package calculator;

public class ArabicCalculator {
    private int[] parseArabic(String input){
        String[] split = input.split(" ");
        int[] res = new int[2];
        int i, j;
        try {
            i = Integer.parseInt(split[0]);
            j = Integer.parseInt(split[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Arabic and Roman numbers do not come together!");
        }
        return res;
    }

    String calcArabic(String input) {
        String[] split = input.split(" ");
        int[] parseArabic = parseArabic(input);
        int i = parseArabic[0];
        int j = parseArabic[1];
        String sign = split[1];
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

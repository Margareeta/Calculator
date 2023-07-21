package calculator;

public class ArabicCalculator {

    String calcArabic(String input) {
        String[] split = input.split(" ");
        int i = Integer.parseInt(split[0]);
        int j = Integer.parseInt(split[2]);
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

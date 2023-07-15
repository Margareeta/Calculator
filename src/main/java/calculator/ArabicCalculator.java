package calculator;

import lombok.AllArgsConstructor;


@AllArgsConstructor
class ArabicCalculator {

    public String calcArabic(String input) {
        //TODO: import my Excepions and validator and add them as maven dependencies (ask Max if google doesn't help me)
        String[] split = input.split(" ");
        int i = Integer.parseInt(split[0]);
        int j = Integer.parseInt(split[2]);
        String sign = split[1];

        switch (sign) {
            case ("+") -> {
                return String.valueOf(i + j);
            }
            case ("-") -> {
                if (i - j < 0) throw new RuntimeException();
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

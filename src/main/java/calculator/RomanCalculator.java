package calculator;

import java.util.Arrays;

class RomanCalculator {
    private int[] convertRomanNumbersToIntw(String input) {
        int[] res = new int[2];
        String[] split = input.split(" ");
        switch (split[0]) {
            case "I":
                res[0] = 1;
                break;
            case "II":
                res[0] = 2;
                break;
            case "III":
                res[0] = 3;
                break;
            case "IV":
                res[0] = 4;
                break;
            case "V":
                res[0] = 5;
                break;
            case "VI":
                res[0] = 6;
                break;
            case "VII":
                res[0] = 7;
                break;
            case "VIII":
                res[0] = 8;
            case "IX":
                res[0] = 9;
                break;
            case "X":
                res[0] = 10;
                break;
        }
        switch (split[2]) {
            case "I":
                res[1] = 1;
                break;
            case "II":
                res[1] = 2;
                break;
            case "III":
                res[1] = 3;
                break;
            case "IV":
                res[1] = 4;
                break;
            case "V":
                res[1] = 5;
                break;
            case "VI":
                res[1] = 6;
                break;
            case "VII":
                res[1] = 7;
                break;
            case "VIII":
                res[1] = 8;
            case "IX":
                res[1] = 9;
                break;
            case "X":
                res[1] = 10;
                break;
        }
        return res;
    }

    private String convertIntegersToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        for (RomanDigits value : RomanDigits.values()) {
            int val = value.getValue();
            while (number  >=  val) {
                number -= val;
                sb.append(value);
            }
        }
        return sb.toString();
    }

    public String calcRoman(String input) {
        int res = 0;
        String[] split = input.split(" ");
        int[] ints = convertRomanNumbersToIntw(input);
        int i = ints[0];
        int j = ints[1];
        switch (split[1]) {
            case "+" -> res = Arrays.stream(ints).sum();
            case "-" -> {
                if (i - j > 0) {
                    res = i - j;
                } else throw new IllegalArgumentException("There are no  zero and no roman numbers below zero!");
            }
            case "*" -> res = i * j;
            case "/" -> res = i / j;
        }
        return convertIntegersToRoman(res);
    }
}

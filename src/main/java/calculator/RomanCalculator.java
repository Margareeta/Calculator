package calculator;

import java.util.Arrays;

class RomanCalculator {
    int parseRoman(String roman) {
        int res = 0;
        switch (roman) {
            case "I":
                res = 1;
                break;
            case "II":
                res = 2;
                break;
            case "III":
                res = 3;
                break;
            case "IV":
                res = 4;
                break;
            case "V":
                res = 5;
                break;
            case "VI":
                res = 6;
                break;
            case "VII":
                res = 7;
                break;
            case "VIII":
                res = 8;
            case "IX":
                res = 9;
                break;
            case "X":
                res = 10;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return res;
    }

    private int[] convertRomanNumbersToIntw(String input) {
        int[] res = new int[2];
        String[] split = input.split(" ");
        res[0] = parseRoman(split[0]);
        res[1] = parseRoman(split[2]);
        return res;

    }

    private String convertIntegersToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        for (RomanDigits value : RomanDigits.values()) {
            int val = value.getValue();
            while (number >= val) {
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

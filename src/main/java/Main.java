import calculator.ArabicCalculator;
import calculator.RomanCalculator;
import exceptions.NotAnArithmeticOperationException;
import validator.StringValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    private static final ArabicCalculator arabicCalculator = new ArabicCalculator();
    private static final RomanCalculator romanCalculator = new RomanCalculator();



    public static String calc(String input) {
        String res = "";
        if (StringValidator.isValidArabicMathExpression(input)) {
            res = arabicCalculator.calcArabic(input);
        }else  if (StringValidator.isValidRomanMathExpression(input)){
            res = romanCalculator.calcRoman(input);
        }
        else throw new NotAnArithmeticOperationException();
        return res;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println(calc(input));

    }
}

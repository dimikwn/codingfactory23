package gr.aueb.cf.ch2;

import org.w3c.dom.ls.LSOutput;

/**
 * Expressions Examples
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result =0;

        result = (num1 + num2 * (num2 - (15 / num1)));

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d, result: %d",
                sum, sub, mul, div, mod, result);

    }
}

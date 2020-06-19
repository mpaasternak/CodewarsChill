package kata_8kyu;

import java.math.BigDecimal;

/*
Complete the function that calculates the area of the red square, when the length of the circular arc A is given
as the input. Return the result rounded to two decimals.

Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
 */

public class Rounding {
    public static double squareArea(double A) {
        return BigDecimal.valueOf(Math.pow((A * 2 / Math.PI), 2))
                .setScale(2, BigDecimal.ROUND_DOWN)
                .doubleValue();
    }

    public static void main(String[] args) {
        double A = 10.23;
        System.out.println(squareArea(A));
    }
}

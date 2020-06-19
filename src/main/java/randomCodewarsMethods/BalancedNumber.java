package randomCodewarsMethods;

/*
Balanced number is the number that * The sum of all digits to the left of the middle digit(s)
and the sum of all digits to the right of the middle digit(s) are equal*.
Task
Given a number, Find if it is Balanced or not .
If the number has an odd number of digits then there is only one middle digit
, e.g. 92645 has middle digit 6; otherwise, there are two middle digits , e.g. 1301 has middle digits 3 and 0

The middle digit(s) should not be considered when determining whether
 a number is balanced or not, e.g 413023 is a balanced number because the left sum and right sum are both 5.

Number passed is always Positive .

Return the result as String
 */

public class BalancedNumber {
    static String balancedNum(long number) {
        String nTS = "" + number;
        int leftTotal = 0;
        int rightTotal = 0;

        if (nTS.length() < 3) {
            return "Balanced";
        }

        for (int i = 0; i < Math.round(nTS.length() / 2.0) - 1; i++) {
            leftTotal += Integer.parseInt("" + nTS.charAt(i));
        }
        for (int i = nTS.length() - 1; i > nTS.length() - Math.round(nTS.length() / 2.0); i--) {
            rightTotal += Integer.parseInt("" + nTS.charAt(i));
        }

        return (leftTotal == rightTotal) ? "Balanced" : "Not Balanced";
    }
}

package kata_7kyu;

/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class GetMinAndMax {
    public static String highAndLow(String numbers) {
        String[] digit = numbers.split("\\s");
        int numbersMinimum = Integer.parseInt(digit[0]);
        int numbersMaximum = Integer.parseInt(digit[0]);

        if (digit.length == 1) {
            return String.format("%d %d", numbersMaximum, numbersMinimum);
        }

        for (String digitCheck : digit) {
            if (Integer.parseInt(digitCheck) > numbersMaximum) {
                numbersMaximum = Integer.parseInt(digitCheck);
            } else if (Integer.parseInt(digitCheck) < numbersMinimum){
                numbersMinimum = Integer.parseInt(digitCheck);
            }
        }
        return String.format("%d %d", numbersMaximum, numbersMinimum);
    }

    public static String highAndLowStream(String numbers){
        IntSummaryStatistics digitComparing = Arrays.stream(numbers.split("\\s"))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        return String.format("%d %d", digitComparing.getMax(), digitComparing.getMin());
    }
}

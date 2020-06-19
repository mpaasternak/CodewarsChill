package kata_8kyu;

import java.util.Arrays;

/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

public class SumPositiveNumbers {
    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }
}

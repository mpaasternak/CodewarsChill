package kata_8kyu;

import java.util.Arrays;

/*
Your task is to sum the differences between consecutive pairs in the array in descending order.

For example: sumOfDifferences([2, 1, 10]) Returns 9

Descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).
 */

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        if (arr == null || arr.length == 1) {
            return 0;
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[arr.length - i] - arr[arr.length - i - 1];
        }
        return sum;
    }
}

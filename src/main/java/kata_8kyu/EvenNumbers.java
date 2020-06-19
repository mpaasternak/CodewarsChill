package kata_8kyu;

/*
Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
First argument is an array of numbers and the second is the divisor.

Example
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
 */

import java.util.Arrays;

public class EvenNumbers {
    public static int[] streamDivisibleBy(int[] numbers, int divider) {
        int[] output = Arrays.stream(numbers)
                .filter(x -> (x % divider) == 0)
                .toArray();
        return output;
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] outcome = new int[count];
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                outcome[i] = number;
                i++;
            }
        }
        return outcome;
    }
}

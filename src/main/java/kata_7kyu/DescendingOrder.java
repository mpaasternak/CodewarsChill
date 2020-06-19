package kata_7kyu;

/*
Your task is to make a function that can take any non-negative integer as a
argument and return it with its digits in descending order. Essentially,
 rearrange the digits to create the highest possible number.

Examples:
Input: 21445 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    public static int sortDescII(final int num) {
        StringBuilder sb = new StringBuilder();
        String[] digits = String.valueOf(num).split("");
        Arrays.stream(digits).sorted().forEach(sb::append);
        return Integer.parseInt(sb.reverse().toString());
    }

    public static void main(String[] args) {
        sortDescII(1235363362);
    }
}

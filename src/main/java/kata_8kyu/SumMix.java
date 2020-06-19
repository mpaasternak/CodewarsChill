package kata_8kyu;

/*
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
 */

import java.util.List;

public class SumMix {
    public static int sum(List<?> mixed){
        int outcome = mixed.stream()
                .mapToInt(x -> Integer.parseInt(x.toString())).sum();
        return outcome;
    }
}

package kata_8kyu;

import java.util.Arrays;

/*
Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
 */

public class LostWithoutAMap {
    public static int[] map(int[] arr){
        int[] output = new int[arr.length];
        int i = 0;
        for (int number: arr){
            output[i] = number * 2;
            i++;
        }
        return output;
    }

    public static int[] mapStream(int[] arr){
        int[] output = Arrays.stream(arr)
                .map(x-> x* 2).toArray();
        return output;
    }
}

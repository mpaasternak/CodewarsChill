package randomCodewarsMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
             if (numbers[j] == target - numbers[i])
                 return new int[] {i, j};
            }
        }
        return null;
    }
    public static int[] twoSumV2(int[] numbers, int target){
        Map<Integer,Integer> numberMap = new HashMap<>();
        int complement;
        for (int i = 0; i < numbers.length; i++){
            complement = target - numbers[i];
            if (numberMap.containsKey(complement)) {
                return new int[] {numberMap.get(complement), i};
            }
            numberMap.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3};
        System.out.println(Arrays.toString(twoSum(test, 6)));
        System.out.println(Arrays.toString(twoSumV2(test, 6)));
    }
}

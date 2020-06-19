package kata_8kyu;

/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the
negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
 */

public class InvertValues {
    public static int[] invert(int[] array) {
        int[] outcome = new int[array.length];
        if (array.length == 0) {
            return new int[]{};
        } else {
            for (int i = 0; i < array.length; i++) {
                outcome[i] = array[i] * -1;
            }
            return outcome;
        }
        //return Arrays.stream(array).map(x -> -x).toArray();
    }
}

package randomCodewarsMethods;

import java.util.Arrays;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i-1];
            sumRight -= arr[i];
            if (sumLeft == sumRight)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,3,2,1};
        //System.out.println(findEvenIndex(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
    }
}
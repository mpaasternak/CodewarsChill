package randomCodewarsMethods;

import java.util.Arrays;

public class oddOrEven {
    public static void oddOrEvenMethod(int[] array){
        int isOdd = Arrays.stream(array).sum();
        if (isOdd % 2 == 0){
            System.out.println(isOdd + " even");
        } else {
            System.out.println(isOdd + " odd");
        }
    }

    public static void main(String[] args) {
        int[] test = {2, 5, 34, 6};
        oddOrEvenMethod(test);
    }
}

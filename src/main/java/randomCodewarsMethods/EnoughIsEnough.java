package randomCodewarsMethods;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int[] photoToShow = new int[(int) IntStream.of(elements).distinct().count()];
        for (int i = 0; i < elements.length; i++){
            photoToShow = IntStream.of(elements).distinct().toArray();
        }
        return photoToShow;
    }

    public static void main(String[] args) {
        int[] test = new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 };
        System.out.println(Arrays.toString(deleteNth(test, 2)));
    }
}

package randomCodewarsMethods;

import java.util.Arrays;

public class HighAndLow {
    public static String highAndLow(String numbers){
        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();
        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();
        return String.format("%d %d", max, min);
    }

    public static void main(String[] args) {
        String test = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        highAndLow(test);
    }
}

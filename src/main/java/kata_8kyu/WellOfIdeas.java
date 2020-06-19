package kata_8kyu;

import java.util.Arrays;

public class WellOfIdeas {
    public static String well(String[] x) {
        int count = (int) Arrays.stream(x).filter(o -> o.equalsIgnoreCase("good")).count();
        if (count > 2) {
            return "I smell a series!";
        } else if (count >= 1 && count <= 2) {
            return "Publish!";
        } else {
            return "Fail!";
        }
    }

    public static void main(String[] args) {
        String[] test = new String[]{"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"};
        int count = (int) Arrays.stream(test).filter(o -> o.equalsIgnoreCase("good")).count();
        System.out.println(count);
    }
}

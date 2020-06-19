package randomCodewarsMethods;

import java.util.Arrays;

public class Tortoise {
    public static int[] race(int v1, int v2, int g){
        if (v1 >= v2)
            return null;
        int[] arrTime = new int[3];
        int time = (int)(((double)(g)/(v2 - v1)) * 3600);
        //counting hours
        arrTime[0] = time / 3600;
        //counting minutes
        arrTime[1] = time % 3600 / 60;
        //counting seconds
        arrTime[2] = time % 3600 % 60 % 60;
        return arrTime;
    }

    public static void main(String[] args) {
        int a = 720;
        int b = 850;
        int c = 70;
        System.out.println(Arrays.toString(race(a, b, c)));
    }
}
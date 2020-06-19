package randomCodewarsMethods;

public class SumOfNumbers {
    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int test = -10;
        System.out.println(Integer.valueOf(test));
    }
}

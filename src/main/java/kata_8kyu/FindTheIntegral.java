package kata_8kyu;

public class FindTheIntegral {
    public static String integrate(int coefficient, int exponent) {
        int multiplier = exponent + 1;
        int number = coefficient / multiplier;
        return number + "x^" + multiplier;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println(integrate(a, b));
    }
}

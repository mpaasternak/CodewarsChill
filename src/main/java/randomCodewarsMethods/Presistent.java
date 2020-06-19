package randomCodewarsMethods;

public class Presistent {
    public static int persistence(long n) {
        //wykluczamy wszelkie10^n
        if (n / 10 == 0)
            return 0;

        long multiplyOfDigits = 1;

        for (long i = n; n != 0; n /= 10) {
            multiplyOfDigits *= (n % 10);
        }

        return persistence(multiplyOfDigits) + 1;
    }


    public static void main(String[] args) {
        System.out.println(persistence(999));
    }
}
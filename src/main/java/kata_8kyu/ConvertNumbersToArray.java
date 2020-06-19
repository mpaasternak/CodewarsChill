package kata_8kyu;


public class ConvertNumbersToArray {
    public static int[] digitize(long n) {
        String numStr = "" + n;
        int[] digitList = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++){
            digitList[i] = (int) (n % 10);
            n/=10;
        }
        return digitList;
    }
}

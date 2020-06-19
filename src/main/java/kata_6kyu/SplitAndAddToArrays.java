package kata_6kyu;

public class SplitAndAddToArrays {
    private int firstSize;
    private int secondSize;

    public SplitAndAddToArrays(int firstSize, int secondSize) {
        this.firstSize = firstSize;
        this.secondSize = secondSize;
    }

    public int getFirstSize() {
        return firstSize;
    }

    public int getSecondSize() {
        return secondSize;
    }

    public static int[] splitAndAdd(int[] numbers, int n) {
        SplitAndAddToArrays size = getArraySize(n);
        getArraySize(n);
        int[] firstTable = new int[size.getFirstSize()];
        int[] secondTable = new int[size.getSecondSize()];
        return null;
    }

    public static SplitAndAddToArrays getArraySize(int n) {
        int a, b;
        if (n % 2 != 0) {
            a = n / 2;
            b = n / 2 + 1;
        } else {
            a = n / 2;
            b = n / 2;
        }
        return new SplitAndAddToArrays(a, b);
    }

}

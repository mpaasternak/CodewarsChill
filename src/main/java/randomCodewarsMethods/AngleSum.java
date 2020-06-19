package randomCodewarsMethods;

public class AngleSum {
    /*
    Find the total sum of internal angles in an n-sided simple polygon. N will be greater than 2.
     */
    static int sumOfAngles(int n) {
        return 180 * (n -2);
    }
}

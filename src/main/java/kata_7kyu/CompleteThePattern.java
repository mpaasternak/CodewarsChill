package kata_7kyu;

/*
Task:
You have to write a function pattern which returns the following Pattern (See Pattern & Examples) upto n number of rows.

Note: Returning the pattern is not the same as Printing the pattern.
Rules/Note:
If n < 1 then it should return "" i.e. empty string.
There are no whitespaces in the pattern.
Pattern:
(n)(n-1)(n-2)...4321
(n)(n-1)(n-2)...432
(n)(n-1)(n-2)...43
(n)(n-1)(n-2)...4
...............
..............
(n)(n-1)(n-2)
(n)(n-1)
(n)
 */

public class CompleteThePattern {
    public static String pattern(int n) {
        if (n < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                sb.append(j);
            }
            if (i < n)
                sb.append('\n');
        }
        return sb.toString();
    }
}

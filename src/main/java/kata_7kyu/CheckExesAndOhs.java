package kata_7kyu;

/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
 */


public class CheckExesAndOhs {
    public static boolean getXO(String str) {
        int numberX = 0;
        int numberO = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X' || str.charAt(i) == 'x')
                numberX++;
            else if (str.charAt(i) == 'O' || str.charAt(i) == 'o')
                numberO++;
        }
        return (numberO == numberX);
    }
}

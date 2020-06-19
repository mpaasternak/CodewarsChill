package kata_7kyu;

/*
Implement a method that accepts 3 integer values a, b, c.
The method should return true if a triangle can be built with the sides of given length and false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).
 */

public class IsThisTriangle {
    public static boolean isTriangle(int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0){
            return false;
        }
        boolean oneSide = a + b > c;
        boolean secondSide = b + c > a;
        boolean thirdSide = c + a > b;

        return oneSide && secondSide && thirdSide;
    }
}

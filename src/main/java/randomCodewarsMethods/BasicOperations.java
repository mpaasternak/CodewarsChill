package randomCodewarsMethods;

public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                result = v1 / v2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String op = "+";
        int a = 5;
        int b = 6;
        basicMath(op, a, b);
    }
}

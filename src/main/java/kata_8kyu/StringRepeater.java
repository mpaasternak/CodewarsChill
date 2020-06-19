package kata_8kyu;

/*
Write a function called repeatString which repeats the given String src exactly count times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */

public class StringRepeater {
    public static String repeatStr(final int occurNumber, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < occurNumber; i++) {
            sb.append(string);
        }
        return sb.toString();
        //return string.repeat(occurNumber)
    }
}

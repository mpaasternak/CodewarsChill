package kata_7kyu;
/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Mumbling {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) {
                sb.append('-');
            }
            sb.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                sb.append(Character.toLowerCase(c));
            }
            i++;
        }
        return sb.toString();
    }
}

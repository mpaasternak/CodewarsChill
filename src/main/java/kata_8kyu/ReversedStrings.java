package kata_8kyu;

/*
Complete the solution so that it reverses the string value passed into it.

Kata.solution("world") //returns "dlrow"
 */

public class ReversedStrings {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

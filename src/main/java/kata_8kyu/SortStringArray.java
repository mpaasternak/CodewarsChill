package kata_8kyu;

/*
You will be given an vector of string(s). You must sort it alphabetically (case-sensitive!!)
and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.
 */

import java.util.Arrays;

public class SortStringArray {
    public static String twoSort(String[] s) {
        String firstWord;
        StringBuilder outcomeString = new StringBuilder();
        Arrays.sort(s);
        firstWord = s[0];
        char[] wordLetters = firstWord.toCharArray();
        for (int i = 0; i < wordLetters.length; i++) {
            if (i + 1 == wordLetters.length) {
                outcomeString.append(firstWord.charAt(i));
                break;
            }
            outcomeString.append(firstWord.charAt(i)).append("***");
        }

        return outcomeString.toString();
    }

    public static String twoSortStream(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
}

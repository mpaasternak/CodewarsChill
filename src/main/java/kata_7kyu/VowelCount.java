package kata_7kyu;

import java.util.Arrays;
import java.util.List;

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */

public class VowelCount {
    private static final List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

    public static int getCount(String str) {
        int vowelsCount = 0;
        vowelsCount = (int) str.chars().filter(i -> vowelList.contains(Character.toString((char) i))).count();
        return vowelsCount;
    }
}

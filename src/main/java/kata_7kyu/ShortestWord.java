package kata_7kyu;

/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
 */

import java.util.stream.Stream;

public class ShortestWord {
    public static int findShort(String s) {
        int minLengthOfWord = s.length();
        for (String word : s.split("\\s")) {
            if (word.length() < minLengthOfWord) {
                minLengthOfWord = word.length();
            }
        }
        return minLengthOfWord;
    }

    public static int findShortStream(String s){
        return Stream.of(s.split("\\s"))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

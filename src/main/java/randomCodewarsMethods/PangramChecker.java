package randomCodewarsMethods;
/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence
"The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once
(case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
Ignore numbers and punctuation.
 */

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    static boolean check(String sentence) {
        String removeSpecialSigns = sentence.replaceAll("[., ]", "").toLowerCase();
        Set<Character> alphabetList = new HashSet<>();
        for (int i = 0; i < removeSpecialSigns.length(); i++) {
            alphabetList.add(removeSpecialSigns.charAt(i));
        }
        if (alphabetList.size() < 26) {
            return false;
        } else {
            return true;
        }
    }

    static boolean checkV2(String sentence){
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }

    public static void main(String[] args) {
        String test = "abc. cASDASdba";
        System.out.println(test.replaceAll("[. ]", "").toLowerCase());
    }
}

package randomCodewarsMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

    /*
    An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
    Note: anagrams are case insensitive
    Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
     */

    public static boolean isAnagram(String test, String original){
        List<Character> letterTestList = new ArrayList<>();
        List<Character> letterOriginalList = new ArrayList<>();
        boolean checkLists;
        test = test.toLowerCase();
        original = original.toLowerCase();

        if (test.length() != original.length()) {
            return false;
        }
        else {
            for (int i = 0; i < test.length(); i ++){
                letterTestList.add(test.charAt(i));
                letterOriginalList.add(original.charAt(i));
            }
            Collections.sort(letterTestList);
            Collections.sort(letterOriginalList);
            checkLists = letterTestList.equals(letterOriginalList);
            return checkLists;
        }
    }

    public static void main(String[] args) {
        String n1 = "foefet";
        String n2 = "toffee";
        String n3 = "Buckethead";
        String n4 = "DeathCubeK";
        String n5 = "Twoo";
        String n6 = "Woot";
        String n7 = "apple";
        String n8 = "pale";

        System.out.println(isAnagram(n1, n2));
        System.out.println(isAnagram(n3, n4));
        System.out.println(isAnagram(n5, n6));
        System.out.println(isAnagram(n7, n8));
    }
}

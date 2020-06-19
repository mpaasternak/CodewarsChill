package randomCodewarsMethods;

/*
The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing
the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.

Write a function that takes a string and turns any and all "words" (see below) within that string of length 4
or greater into an abbreviation, following these rules:

A "word" is a sequence of alphabetical characters. By this definition, any other character like a space
or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
The abbreviated version of the word should have the first letter, then the number of removed characters,
then the last letter (eg. "elephant ride" => "e6t r2e").
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordAbbreviator {
    public static String abbreviate(String string) {
        int stringLength = string.length();
        StringBuilder sb = new StringBuilder();
        char[] charArray = new char[stringLength + 1];
        if (stringLength <= 3) {
            return string;
        }
        for (int i = 0; i < stringLength; i++) {
            charArray[i] = string.charAt(i);
        }
        sb.append(charArray[0]);
        sb.append(stringLength - 2);
        sb.append(charArray[stringLength - 1]);
        return sb.toString();
    }

    public static String abbreviateV2(String string){
        Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(string);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String g = m.group();
            int l = g.length();
            m.appendReplacement(sb, g.substring(0, 1) + (l - 2) + g.substring(l - 1, l));
        }
        m.appendTail(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(abbreviateV2("TeeeeeeeeT Abecadlo"));
    }
}

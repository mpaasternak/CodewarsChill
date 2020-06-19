package randomCodewarsMethods;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileFaces {
    public static int countSmileys(List<String> arr){
        Pattern p = Pattern.compile("^[:;][~-]?[)D]$");
        int count = 0;
        for (String word: arr){
            Matcher m = p.matcher(word);
            if (m.matches())
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> arr = List.of(":)", ":D", ";-)");
        System.out.println(countSmileys(arr));
    }
}

package kata_8kyu;

/*
Write a simple regex to validate a username. Allowed characters are:

lowercase letters,
numbers,
underscore
Length should be between 4 and 16 characters (both included).
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {
    public static boolean checkUserName(String s) {
        Pattern p = Pattern.compile("^[a-z0-9_]{4,16}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static String b(int age) {
        return "You're a(n) " + (age <= 12 ? "kid" : age <=17 ? "teenager" : age < 65 ? "adult" : "elderly");

    }
}

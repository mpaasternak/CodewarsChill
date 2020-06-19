package randomCodewarsMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {
    public static String printerError(String s){
        String regex = "[a-m]";
        int countErrors = 0;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            countErrors += m.group().length();

        countErrors = s.length() - countErrors;
        return "Errors: [" + countErrors + "/" + s.length() + "]";
    }

    public static String printerErrorV2(String s){
        return "Error: [" + s.replaceAll("[a-m]", "").length() + "/" + s.length() + "]";
    }
    public static void main(String[] args) {
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(s));
        System.out.println(printerErrorV2(s));
    }
}

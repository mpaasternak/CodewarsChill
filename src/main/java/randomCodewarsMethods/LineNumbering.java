package randomCodewarsMethods;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    /*
    Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
    Write a function which takes a list of strings and returns each line prepended by the correct number.
    The numbering starts at 1. The format is n: string. Notice the colon and space in between.
     */

    public static List<String> number(List<String> lines) {
        ArrayList<String> output = new ArrayList<>();
        int i = 0;
        for(String x: lines) {
            output.add(++i + ": " + x);
        }
        return output;
    }

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("a");
        lines.add("b");
        lines.add("c");
        lines.add("d");
        System.out.println(number(lines));

    }
}

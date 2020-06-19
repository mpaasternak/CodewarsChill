package randomCodewarsMethods;

public class SequenceSum {
    public static String showSequenceOne(int value) {
        String text = "";
        if (value < 0) {
            return "" + value + "<0";
        }
        if (value == 0) {
            return "0=0";
        }
        for (int i = 0; i <= value; i++){
            text = "" + i + "+";
        }
        return text.substring(0,text.length() - 1) + " = " + (value * (value - 1) / 2);
    }

    public static void main(String[] args) {
        System.out.println(showSequenceOne(2));
    }

}

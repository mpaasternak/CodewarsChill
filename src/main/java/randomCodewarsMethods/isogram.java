package randomCodewarsMethods;

import java.util.Arrays;

public class isogram {
    public static boolean isIsogram(String str){
        str = str.toLowerCase();
        char[] list = str.toCharArray();
        Arrays.sort(list);
        for (int i = 0; i < str.length() - 1; i++){
            if (list[i] == list[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Tel";
        System.out.println(isIsogram(str));
    }
}

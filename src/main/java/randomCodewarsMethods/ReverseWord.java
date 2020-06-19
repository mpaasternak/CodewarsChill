package randomCodewarsMethods;

public class ReverseWord {
    //rozbija stringa na poszczegolne znaki i odwraca calego string
    public static String reverseWords(final String original){
        char[] words = new char[original.length()];
        for (int i = 0; i < words.length; i++){
            words[i] = original.charAt(i);
        }
        for (int j = original.length() - 1; j >= 0; j--){
            System.out.print(words[j]);
        }
        return "test";
    }
    //Dzieli stringa na wyrazy i odwraca wyrazy
    public static String reverseWords1(final String original){
        String[] words = original.split(" ");
        if (words.length == 0)
            return original;

        int i = 0;
        for (String a: words){
            words[i] = new StringBuilder(a).reverse().toString();
            i++;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String test = "abcTe rfGhij asda sd sdsd";
        System.out.println(reverseWords1(test));
    }
}

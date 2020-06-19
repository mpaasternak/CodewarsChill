package kata_8kyu;

public class ForEasyOnes {

    public static String howMuchILoveYou(int nb_petals) {
        int answer = nb_petals % 6;
        switch (answer) {
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 0:
                return "not at all";
        }
        return null;
    }

    public static String bmi(double weight, double height) {
        double personBmi = (weight / Math.pow(height, 2));
        if (personBmi <= 18.5) {
            return "Underweight";
        }
        if (personBmi <= 25.0) {
            return "Normal";
        }
        if (personBmi <= 30.0) {
            return "Overweight";
        }
        if (personBmi > 30) {
            return "Obese";
        }
        return "";
    }

    public static char getChar(int c) {
        return (char) c;
    }

    public static String[] stringToArray(String s) {
        String[] splitString = s.split(" ");
        return splitString;
    }

    public static int[] multipleOfIndex(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % i == 0) {
                count++;
            }
        }
        int[] outcome = new int[count];
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                outcome[i - 1] = array[i];
            }
        }
        return outcome;
    }

    public static void main(String[] args) {
        double weight = 80;
        double height = 1.80;
        double personBmi = weight / Math.pow(height, 2);
        System.out.println(personBmi);
    }
}

package kata_8kyu;

import java.util.stream.IntStream;

/*
You take your son to the forest to see the monkeys. You know that there are a certain number there (n),
but your son is too young to just appreciate the full number, he has to start counting them from 1.

As a good parent, you will sit and count with him. Given the number (n), populate an array with all
numbers up to and including that number, but excluding zero.

For example:

monkeyCount(10) // --> new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
monkeyCount(1) // --> new int[]{1}
 */

public class CountTheMonkeys {
    public static int[] streamMonkeyCount(final int n){
        // return IntStream.rangeClosed(1, n).toArray();, above function might be updated starting from 1 to n + 1.
        return IntStream.range(1, n)
                .map(x -> x + 1)
                .toArray();
    }

    public static int[] monkeyCount(final int n){
        int[] outcome = new int[n];
        for (int i = 1; i < n; i++){
            outcome[i-1] = i;
        }
        return outcome;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] outcome = new int[n];
        for (int i = 1; i < n; i++){
            outcome[i-1] = i;
        }
        for (int number: outcome){
            System.out.println(number);
        }
    }
}

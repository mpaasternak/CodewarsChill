package kata_8kyu;

/*
Get the number n (n>0) to return the reversed sequence from n to 1.

Example : n=5 >> [5,4,3,2,1]
 */

public class Sequence {
    public static int[] reverse(int n){
        int[] reversedNumbersList = new int[n];
        for (int i = 0; i < n; i++){
            reversedNumbersList[i] = n - i;
        }
        return reversedNumbersList;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(reverse(number));
    }
}

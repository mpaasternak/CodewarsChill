package randomCodewarsMethods;

public class FindOdd {
    public static int findIt(int[] a){
        int p = 0;
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j])
                    p++;
            }
            if (p % 2 != 0)
                return a[i];
        }
        return 0;
    }
    public static int fintItV2(int[] a){
        int p = 0;
        for (int i = 0; i < a.length; i++){
            p ^= a[i];
        }
        return p;
    }
    public static void main(String[] args) {
        int [] numbers = {20,1,-1,2,-2,33,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(findIt(numbers));
        System.out.println(fintItV2(numbers));
    }
}

package randomCodewarsMethods;

public class ProdFib {
    public static long[] productFib(long prod){
        long lowFib = 0;
        long highFib = 1;
        long[] answer = new long[3];

        while (lowFib * highFib <= prod) {
            if (lowFib * highFib == prod) {
                answer[0] = lowFib;
                answer[1] = highFib;
                answer[2] = 1;
                return answer;
            }
            highFib += lowFib;
            lowFib = highFib - lowFib;
        }
        answer[0] = lowFib;
        answer[1] = highFib;
        answer[2] = 0;
        return answer;
    }
}

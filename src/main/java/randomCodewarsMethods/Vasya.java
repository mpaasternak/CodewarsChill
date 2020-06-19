package randomCodewarsMethods;

public class Vasya {
        public static String Tickets(int[] peopleInLine){
            int bill25 = 0, bill50 = 0;
            for (int payment : peopleInLine){
                if(payment==25){
                    bill25++;
                } else if(payment==50){
                    bill25--;
                    bill50++;
                } else if(payment==100){
                    if(bill50>0){
                        bill50--;
                        bill25--;
                    } else{
                        bill25-=3;
                    }
                }
                if(bill25<0 || bill50 <0){
                    return "NO";
                }
            }
            return "YES";
        }
}

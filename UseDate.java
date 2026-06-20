package use.the.date.pkgclass;
import java.util.Date;

public class UseDate {
    public static void main(String[] args) {
        long[] times = {10000, 100000, 1000000, 10000000, 100000000, 
                        1000000000L, 10000000000L, 100000000000L};
        
        for (int i = 0; i < times.length; i++) {
            Date date = new Date(times[i]);
            System.out.println("Time: " + times[i] + " -> " + date.toString());
        }
    }
}
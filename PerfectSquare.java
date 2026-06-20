package a.perfectsquare;
import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = input.nextInt();
        
        ArrayList<Integer> factors = new ArrayList<>();
        int temp = m;
        
        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                factors.add(i);
                temp /= i;
            }
        }
        
        ArrayList<Integer> oddFactors = new ArrayList<>();
        for (int i = 0; i < factors.size(); i++) {
            int count = 0;
            int current = factors.get(i);
            for (int j = 0; j < factors.size(); j++) {
                if (factors.get(j) == current) count++;
            }
            if (count % 2 == 1 && !oddFactors.contains(current)) {
                oddFactors.add(current);
            }
        }
        
        int n = 1;
        for (int factor : oddFactors) {
            n *= factor;
        }
        
        System.out.println("n = " + n);
        System.out.println("m * n = " + (m * n));
    }
}
package sumarraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (Double num : list) {
            total += num;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        
        System.out.println("Sum: " + sum(list));
    }
}
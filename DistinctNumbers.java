package distinct.numbers.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter numbers (0 to stop): ");
        int number;
        
        do {
            number = input.nextInt();
            if (!list.contains(number) && number != 0) {
                list.add(number);
            }
        } while (number != 0);
        
        System.out.println("Distinct numbers: " + list);
        System.out.println("Size: " + list.size());
    }
}
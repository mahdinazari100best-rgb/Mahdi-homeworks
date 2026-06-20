package maximumelementinarray;
import java.util.ArrayList;
import java.util.Scanner;
public class MaxArrayList {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) return null;
        
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter numbers (end with 0): ");
        int num;
        while ((num = input.nextInt()) != 0) {
            list.add(num);
        }
        
        Integer maxValue = max(list);
        System.out.println(maxValue == null ? "List is empty" : "Largest number: " + maxValue);
    }
}

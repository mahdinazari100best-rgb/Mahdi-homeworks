package removediplicad;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer num : list) {
            if (!temp.contains(num)) {
                temp.add(num);
            }
        }
        list.clear();
        list.addAll(temp);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        
        removeDuplicate(list);
        System.out.print("Distinct integers: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i > 0 ? " " : "") + list.get(i));
        }
        System.out.println();
    }
}
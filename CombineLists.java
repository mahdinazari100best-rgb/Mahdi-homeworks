package combinetwolists;
import java.util.ArrayList;
import java.util.Scanner;

public class CombineLists {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) list1.add(input.nextInt());
        
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) list2.add(input.nextInt());
        
        ArrayList<Integer> result = union(list1, list2);
        System.out.print("Combined list: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print((i > 0 ? " " : "") + result.get(i));
        }
        System.out.println();
    }
}
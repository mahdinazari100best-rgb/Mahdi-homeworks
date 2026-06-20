package eliminate.duplicates;
import java.util.Scanner;

public class EliminateDuplicates {
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;
        for (int num : list) {
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (temp[i] == num) {
                    exists = true;
                    break;
                }
            }
            if (!exists) temp[count++] = num;
        }
        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) numbers[i] = input.nextInt();
        int[] distinct = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int num : distinct) System.out.print(num + " ");
    }
}
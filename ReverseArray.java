package reversanarray;

import java.util.Scanner;

public class ReverseArray {
    public static int[] reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) numbers[i] = input.nextInt();
        numbers = reverse(numbers);
        System.out.print("Reversed: ");
        for (int num : numbers) System.out.print(num + " ");
    }
}
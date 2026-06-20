package findsmalestnumber;

import java.util.Scanner;

public class FindSmallest {
    public static double min(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) numbers[i] = input.nextDouble();
        System.out.println("The minimum number is " + min(numbers));
    }
}
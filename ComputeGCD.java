package computegcd;
import java.util.Scanner;
public class ComputeGCD {
    public static int gcd(int... numbers) {
       
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) numbers[i] = input.nextInt();
        System.out.println("GCD is " + gcd(numbers));
    }
}
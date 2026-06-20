package findtheindexofthesmallestelement;
import java.util.Scanner;
public class IndexOfSmallest {
    public static int indexOfSmallestElement(double[] array) {
        
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) numbers[i] = input.nextDouble();
        System.out.println("Index of smallest element: " + indexOfSmallestElement(numbers));
    }}
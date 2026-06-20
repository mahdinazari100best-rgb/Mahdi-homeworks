package average.and.above.average;
import java.util.Scanner;

public class AverageAboveAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[100];
        double sum = 0;
        
        for (int i = 0; i < 100; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        
        double average = sum / 100;
        int count = 0;
        
        for (int i = 0; i < 100; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);
    }
}

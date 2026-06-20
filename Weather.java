package weather.information;
import java.io.File;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) throws Exception {
        File file = new File("weather.txt");
        Scanner input = new Scanner(file);
        
        double[] dailyTemp = new double[10];
        double[] dailyHumidity = new double[10];
        int[] tempCount = new int[10];
        int[] humidityCount = new int[10];
        
        while (input.hasNext()) {
            int day = input.nextInt() - 1;
            int hour = input.nextInt() - 1;
            double temp = input.nextDouble();
            double humidity = input.nextDouble();
            
            dailyTemp[day] += temp;
            dailyHumidity[day] += humidity;
            tempCount[day]++;
            humidityCount[day]++;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Day " + (i + 1) + ":");
            System.out.println("  Average Temperature: " + (dailyTemp[i] / tempCount[i]));
            System.out.println("  Average Humidity: " + (dailyHumidity[i] / humidityCount[i]));
        }
        
        input.close();
    }
}

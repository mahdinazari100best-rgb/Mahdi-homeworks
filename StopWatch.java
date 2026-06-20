package stopwatch;
public class StopWatch {
    long startTime;
    long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    void start() {
        startTime = System.currentTimeMillis();
    }

    void stop() {
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        
       
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }
        
        watch.start();
        
        // (Selection Sort)
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        
        watch.stop();
        System.out.println("Sorting 100,000 numbers took " + watch.getElapsedTime() + " milliseconds");
    }
}
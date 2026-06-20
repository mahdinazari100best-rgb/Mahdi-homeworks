package coutsingledigit;

public class CountSingleDigits {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10);
            counts[num]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}
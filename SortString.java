package sortchracterinstring;
import java.util.Scanner;

public class SortString {
    public static String sort(String s) {
        char[] chars = s.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Sorted string: " + sort(s));
    }
}
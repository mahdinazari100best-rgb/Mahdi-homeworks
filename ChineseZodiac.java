package chienszodia;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Zodiac: " + animals[year % 12]);
    }
}

package additeonquiz;
import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<>();
        
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        
        System.out.print("What is " + n1 + " + " + n2 + "? ");
        int answer = input.nextInt();
        
        while (answer != n1 + n2) {
            if (answers.contains(answer)) {
                System.out.print("Already entered " + answer + " ");
            }
            answers.add(answer);
            System.out.print("Wrong. Try again: ");
            answer = input.nextInt();
        }
        
        System.out.println("Correct!");
    }
}
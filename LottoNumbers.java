package lotto.numbers;
import java.io.File;
import java.util.Scanner;

public class LottoNumbers {
    public static void main(String[] args) throws Exception {
        File file = new File("LottoNumbers.txt");
        Scanner input = new Scanner(file);
        boolean[] covered = new boolean[100];
        int number;
        
        while (input.hasNext()) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            covered[number] = true;
        }
        
        boolean allCovered = true;
        for (int i = 1; i <= 99; i++) {
            if (!covered[i]) {
                allCovered = false;
                break;
            }
        }
        
        if (allCovered) {
            System.out.println("All numbers 1-99 are covered");
        } else {
            System.out.println("Not all numbers are covered");
        }
        
        input.close();
    }
}

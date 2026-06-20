package coutapearcase;
public class CountUppercase {
    public static void main(String[] args) {
        if (args.length > 0) {
            String str = args[0];
            int count = 0;
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) count++;
            }
            System.out.println("Number of uppercase letters: " + count);
        }
    }
}
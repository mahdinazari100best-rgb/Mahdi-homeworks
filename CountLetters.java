package counting.letter.occurrences;
public class CountLetters {
    public static void main(String[] args) {
        String text = "Hello World! This is a test string. 12345.";
        int[] counts = new int[26];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                counts[ch - 'a']++;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i) + ": " + counts[i]);
        }
    }
}
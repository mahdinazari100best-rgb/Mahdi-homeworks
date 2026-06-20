package counting.occurrence.of.each.letter;
public class CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();
        int[] counts = countLetters(chars);
        displayCounts(counts);
    }
    
    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)('a' + Math.random() * 26);
        }
        return chars;
    }
    
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }
    
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println((char)('a' + i) + ": " + counts[i]);
        }
    }
}

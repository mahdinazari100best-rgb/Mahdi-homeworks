package arraylistofcharacter;
import java.util.ArrayList;

public class CharacterArrayList {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        return list;
    }
    
    public static void main(String[] args) {
        ArrayList<Character> list = toCharacterArray("abc");
        System.out.println(list);
    }
}
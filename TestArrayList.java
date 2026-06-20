package generic.type.arraylist;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        
        cities.add("New York");
        cities.add("London");
        cities.add("Tehran");
        cities.add("Paris");
        
        System.out.println("Cities: " + cities);
        System.out.println("Size: " + cities.size());
        System.out.println("First city: " + cities.get(0));
        
        cities.set(1, "Tokyo");
        System.out.println("After update: " + cities);
        
        cities.remove("Tehran");
        System.out.println("After removal: " + cities);
    }
}
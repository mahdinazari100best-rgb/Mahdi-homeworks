package passing.array.as;
public class TestPassArray {
    public static void main(String[] args) {
        int x = 1;
        int[] y = new int[10];
        
        System.out.println("Before swap: x = " + x);
        System.out.println("Before swap: y[0] = " + y[0]);
        
        swap(x, y);
        
        System.out.println("After swap: x = " + x);
        System.out.println("After swap: y[0] = " + y[0]);
    }
    
    public static void swap(int a, int[] b) {
        int temp = a;
        a = b[0];
        b[0] = temp;
    }
}

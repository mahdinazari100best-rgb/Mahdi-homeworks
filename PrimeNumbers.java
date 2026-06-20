package display.the.prime.number1;
class StackOfIntegers {
    private int[] elements = new int[100];
    private int size = 0;
    
    public void push(int value) {
        elements[size] = value;
        size++;
    }
    
    public int pop() {
        size--;
        return elements[size];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
}

public class PrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        
        for (int i = 2; i < 120; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                stack.push(i);
            }
        }
        
        System.out.println("Prime numbers less than 120 in descending order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
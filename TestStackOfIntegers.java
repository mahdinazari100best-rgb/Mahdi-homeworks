package stack.of.integer.pkgclass;

class StackOfIntegers {
    private int[] elements;
    private int size;
    
    public StackOfIntegers() {
        this(16);
    }
    
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
        size = 0;
    }
    
    public boolean empty() {
        return size == 0;
    }
    
    public int peek() {
        return elements[size - 1];
    }
    
    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;
        return value;
    }
    
    public int pop() {
        size--;
        return elements[size];
    }
    
    public int getSize() {
        return size;
    }
}

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        
        System.out.println("Size: " + stack.getSize());
        
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
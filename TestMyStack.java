package my.stack.pkgclass;
import java.util.ArrayList;

class MyStack {
    private ArrayList<Object> list = new ArrayList<>();
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public int getSize() {
        return list.size();
    }
    
    public Object peek() {
        return list.get(list.size() - 1);
    }
    
    public Object pop() {
        return list.remove(list.size() - 1);
    }
    
    public void push(Object o) {
        list.add(o);
    }
    
    public int search(Object o) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(o)) {
                return list.size() - i;
            }
        }
        return -1;
    }
    
    public String toString() {
        return "Stack: " + list.toString();
    }
}

public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        
        stack.push("Hello");
        stack.push(10);
        stack.push(3.14);
        stack.push("World");
        
        System.out.println(stack.toString());
        System.out.println("Size: " + stack.getSize());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack.toString());
        System.out.println("Search '10': " + stack.search(10));
    }
}

package implimentmystack;
import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public boolean isEmpty() {
        return super.isEmpty();
    }
    
    public Object peek() {
        return get(size() - 1);
    }
    
    public Object pop() {
        return remove(size() - 1);
    }
    
    public void push(Object o) {
        add(o);
    }
}


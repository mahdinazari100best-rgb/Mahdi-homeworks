package dynamic.binding.demo;
public class DynamicBindingDemo {
    public static void main(String[] args) {
        Object[] objects = {new GraduateStudent(), new Student(), new Person(), new Object()};
        
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }
}

class GraduateStudent extends Student {
}

class Student extends Person {
    public String toString() {
        return "Student";
    }
}

class Person extends Object {
    public String toString() {
        return "Person";
    }
}
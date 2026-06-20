package circle.with.pkgstatic.members3;

 class CircleWithStaticMembers {
    double radius;
    static int numberOfObjects = 0;
    
    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }
    
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    
    double getArea() {
        return radius * radius * Math.PI;
    }
    
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
}

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("Number of objects: " + CircleWithStaticMembers.numberOfObjects);
        
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("After creating c1");
        System.out.println("c1 radius: " + c1.radius + " area: " + c1.getArea());
        System.out.println("Number of objects: " + CircleWithStaticMembers.numberOfObjects);
        
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        System.out.println("After creating c2");
        System.out.println("c2 radius: " + c2.radius + " area: " + c2.getArea());
        System.out.println("Number of objects: " + CircleWithStaticMembers.numberOfObjects);
    }
}
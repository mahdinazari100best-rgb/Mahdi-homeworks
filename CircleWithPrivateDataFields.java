package passing.objects.to.methods;
 class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
        
        System.out.println("Before: radius = " + myCircle.getRadius());
        printCircle(myCircle);
        System.out.println("After: radius = " + myCircle.getRadius());
    }
    
    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        c.setRadius(5);
    }
}

public class CircleWithPrivateDataFields {
    private double radius = 1;
    private static int numberOfObjects = 0;
    
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }
    
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}

package circle.with.pkgprivate.data.fields;
 class CircleWithPrivateDataFields {
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
}

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Number of objects: " + CircleWithPrivateDataFields.getNumberOfObjects());
        
        myCircle.setRadius(10);
        System.out.println("New radius: " + myCircle.getRadius());
        System.out.println("New area: " + myCircle.getArea());
    }
}
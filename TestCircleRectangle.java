package geometricobject.circle.and.rectangle._inheritance;
import java.util.Date;

 class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;
    
    public GeometricObject() {
        dateCreated = new Date();
    }
    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
    }
}

// Circle Subclass
class Circle extends GeometricObject {
    private double radius;
    
    public Circle() {
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
    public void printCircle() {
        System.out.println("Circle created on " + getDateCreated() + " radius: " + radius);
    }
}

// Rectangle Subclass
 class Rectangle extends GeometricObject {
    private double width;
    private double height;
    
    public Rectangle() {
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// TestCircleRectangle
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nRectangle: " + rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
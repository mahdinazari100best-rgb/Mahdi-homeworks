package regular.polygon;
public class RegularPolygon {
    int n;
    double side;
    double x;
    double y;

    RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int numSides, double sideLength) {
        n = numSides;
        side = sideLength;
        x = 0;
        y = 0;
    }

    RegularPolygon(int numSides, double sideLength, double xCoord, double yCoord) {
        n = numSides;
        side = sideLength;
        x = xCoord;
        y = yCoord;
    }

    double getPerimeter() {
        return n * side;
    }

    double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1: Perimeter = " + p1.getPerimeter() + ", Area = " + p1.getArea());
        System.out.println("Polygon 2: Perimeter = " + p2.getPerimeter() + ", Area = " + p2.getArea());
        System.out.println("Polygon 3: Perimeter = " + p3.getPerimeter() + ", Area = " + p3.getArea());
    }
}
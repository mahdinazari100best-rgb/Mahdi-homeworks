package quadratic.equation;
import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(double aVal, double bVal, double cVal) {
        a = aVal;
        b = bVal;
        c = cVal;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        double disc = getDiscriminant();
        if (disc < 0) {
            return 0;
        }
        return (-b + Math.sqrt(disc)) / (2 * a);
    }

    double getRoot2() {
        double disc = getDiscriminant();
        if (disc < 0) {
            return 0;
        }
        return (-b - Math.sqrt(disc)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        double disc = eq.getDiscriminant();
        
        if (disc > 0) {
            System.out.println("Root 1: " + eq.getRoot1());
            System.out.println("Root 2: " + eq.getRoot2());
        } else if (disc == 0) {
            System.out.println("Root: " + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
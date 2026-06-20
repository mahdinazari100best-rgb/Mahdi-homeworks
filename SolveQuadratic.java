package solvequadraticequations;
import java.util.Scanner;

public class SolveQuadratic {
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0], b = eqn[1], c = eqn[2];
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        } else return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < 3; i++) eqn[i] = input.nextDouble();
        int count = solveQuadratic(eqn, roots);
        System.out.println("Number of real roots: " + count);
        for (int i = 0; i < count; i++) System.out.println("Root: " + roots[i]);
    }
}
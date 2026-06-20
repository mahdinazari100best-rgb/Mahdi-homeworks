package passing.two.dimensional.arrays.to.methods;
public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
        
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total += matrix[i][j];
            }
        }
        
        System.out.println("Sum of matrix: " + total);
    }
}

package sudoko;
public class CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 7, 6, 3, 4, 6, 7, 8},
            {9, 1, 2, 6, 1, 9, 5, 6, 7},
            {2, 1, 9, 5, 3, 4, 8, 9, 8},
            {6, 1, 9, 8, 3, 4, 2, 5, 6},
            {7, 8, 6, 3, 8, 5, 9, 7, 6},
            {1, 4, 2, 3, 4, 8, 3, 1, 4},
            {2, 6, 8, 5, 3, 7, 9, 7, 2},
            {6, 7, 1, 3, 9, 2, 4, 8, 5},
            {6, 6, 9, 6, 1, 5, 3, 7, 2}
        };
        
        boolean valid = true;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    valid = false;
                }
            }
        }
        
        for (int i = 0; i < 9 && valid; i++) {
            boolean[] found = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (found[grid[i][j]]) {
                    valid = false;
                    break;
                }
                found[grid[i][j]] = true;
            }
        }
        
        for (int j = 0; j < 9 && valid; j++) {
            boolean[] found = new boolean[10];
            for (int i = 0; i < 9; i++) {
                if (found[grid[i][j]]) {
                    valid = false;
                    break;
                }
                found[grid[i][j]] = true;
            }
        }
        
        for (int box = 0; box < 9 && valid; box++) {
            boolean[] found = new boolean[10];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    int i = (box / 3) * 3 + row;
                    int j = (box % 3) * 3 + col;
                    if (found[grid[i][j]]) {
                        valid = false;
                        break;
                    }
                    found[grid[i][j]] = true;
                }
            }
        }
        
        if (valid) {
            System.out.println("Solution is correct");
        } else {
            System.out.println("Solution is incorrect");
        }
    }
}

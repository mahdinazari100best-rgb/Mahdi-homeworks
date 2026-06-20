package calculating.total.scores;
public class TotalScore {
    public static void main(String[] args) {
        double[][][] scores = new double[7][5][2];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                scores[i][j][0] = Math.random() * 50;
                scores[i][j][1] = Math.random() * 50;
            }
        }
        
        for (int i = 0; i < 7; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total = total + scores[i][j][0] + scores[i][j][1];
            }
            System.out.println("Student " + (i + 1) + " total: " + total);
        }
    }
}

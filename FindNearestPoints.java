package finding.two.points.nearest.to.each.other;
public class FindNearestPoints {
    public static void main(String[] args) {
        double[][] points = {
            {-1, 3}, {1, 1}, {-1, -1}, {3, 3}, 
            {4, 2}, {2, 0.5}, {4, -0.5}, {2, -1}
        };
        
        int p1 = 0, p2 = 1;
        double shortestDistance = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) + 
                                           Math.pow(points[1][1] - points[0][1], 2));
        
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double d = Math.sqrt(Math.pow(points[j][0] - points[i][0], 2) + 
                                   Math.pow(points[j][1] - points[i][1], 2));
                if (d < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = d;
                }
            }
        }
        
        System.out.println("Closest points: (" + points[p1][0] + ", " + 
                          points[p1][1] + ") and (" + points[p2][0] + ", " + 
                          points[p2][1] + ")");
        System.out.println("Distance: " + shortestDistance);
    }
}

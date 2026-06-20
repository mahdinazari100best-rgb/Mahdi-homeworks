package the.fan.clas;
public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    
    int speed;
    boolean on;
    double radius;
    String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    String toString1() {
        if (on == true) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Color: " + color + ", Radius: " + radius + " (fan is off)";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = fan1.FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;

        Fan fan2 = new Fan();
        fan2.speed = fan2.MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;

        System.out.println("Fan 1: " + fan1.toString1());
        System.out.println("Fan 2: " + fan2.toString1());
    }
}